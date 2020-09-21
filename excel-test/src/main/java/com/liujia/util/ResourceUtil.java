package com.liujia.util;

import lombok.extern.slf4j.Slf4j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;



/**
 *
 * 读取properties文件，yml文件读取不了
 *
 * @author ex_111806190
 * @since 2020-9-17 10:17
 */
@Slf4j
public class ResourceUtil {

    public static Object getParamFromProp(String key) {
        InputStream is = ResourceUtil.class.getClassLoader().getResourceAsStream("application.yml");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        Properties props = new Properties();
        try {
            props.load(br);
            return props.get(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
