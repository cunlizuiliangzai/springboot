package com.liujia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ex_111806190
 * @since 2020-9-21 16:41
 */
@Configuration
public class MyConfigBean {


    //默认以方法名加入容器中
    @Bean
    public ConfigBean getConfigBean() {
        return new ConfigBean("1");
    }

    //以configbean加入容器中
    @Bean("configBean")
    public ConfigBean getConfigBean1() {
        return new ConfigBean("2");
    }
}
