package com.liujia.springfilter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

public class CheckUserFilterNext implements Filter {


    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("过滤器二初始化");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入到第二个过滤器,执行相关逻辑处理");

        HttpServletRequest request = (HttpServletRequest) req;

        String path = request.getRequestURI();
        String method = request.getMethod();
        System.out.println(method);
        //排除一些url的拦截
        if (path.equals("/test/testContext")) {
            filterChain.doFilter(request, res);
        }

        if ("POST".equals(method)) {

            BodyReaderHttpServletRequestWrapper requestWrapper = new BodyReaderHttpServletRequestWrapper(request);

            // 从Request的包装类中读取数据
            BufferedReader reader = requestWrapper.getReader();

            StringBuilder sb = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();

            System.out.println(sb.toString());

            filterChain.doFilter(requestWrapper, res);
        }

    }


    @Override
    public void destroy() {
        System.out.println("过滤器二销毁了");
    }

}