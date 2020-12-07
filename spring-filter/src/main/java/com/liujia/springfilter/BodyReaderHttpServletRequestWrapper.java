package com.liujia.springfilter;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.Map;
import java.util.Vector;

public class BodyReaderHttpServletRequestWrapper extends HttpServletRequestWrapper {


    private final byte[] body;

    /**
     * 所有参数的集合
     */
    private Map<String, String[]> parameterMap;


    public BodyReaderHttpServletRequestWrapper(HttpServletRequest request) throws IOException {
        super(request);
        BufferedReader reader = request.getReader();
        body = readBytes(reader);
        parameterMap = request.getParameterMap();
    }

    @Override
    public BufferedReader getReader() throws IOException {

        ServletInputStream inputStream = getInputStream();

        if (null == inputStream) {
            return null;
        }

        return new BufferedReader(new InputStreamReader(inputStream));
    }

    @Override
    public Enumeration<String> getParameterNames() {
        Vector<String> vector = new Vector<>(parameterMap.keySet());
        return vector.elements();
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {

        if (body == null) {
            return null;
        }

        final ByteArrayInputStream bais = new ByteArrayInputStream(body);
        return new ServletInputStream() {

            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener listener) {

            }

            @Override
            public int read() throws IOException {
                return bais.read();
            }
        };
    }

    /**
     * 通过BufferedReader和字符编码集转换成byte数组
     *
     * @param br
     * @return
     * @throws IOException
     */
    private byte[] readBytes(BufferedReader br) throws IOException {
        String str;
        StringBuilder retStr = new StringBuilder();
        while ((str = br.readLine()) != null) {
            retStr.append(str);
        }
        if (StringUtils.isNotBlank(retStr.toString())) {
            return retStr.toString().getBytes(StandardCharsets.UTF_8);
        }
        return null;
    }
}
