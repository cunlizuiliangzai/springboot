package com.liujia.springfilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class filtconfig {
    /**
     * 第一个过滤器配置
     *
     */

    @Bean
    CheckUserFilter getCheckUserFilter(){
        return new CheckUserFilter();
    }

    @Bean("checkUserFilter")
    public FilterRegistrationBean<CheckUserFilter> checkUserFilter(CheckUserFilter checkUserFilter) {
        FilterRegistrationBean<CheckUserFilter> registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(checkUserFilter);
        registrationBean.addUrlPatterns("/test/*"); //url拦截
        registrationBean.setOrder(1);
        registrationBean.setAsyncSupported(true);
        return registrationBean;
    }


    /**
     * 第二个过滤器配置
     *
     */


    @Bean
    CheckUserFilterNext getCheckUserFilterNext(){
        return new CheckUserFilterNext();
    }

    @Bean("checkUserFilterNext")
    public FilterRegistrationBean<CheckUserFilterNext> checkUserFilterNext(CheckUserFilterNext checkUserFilterNext) {
        FilterRegistrationBean<CheckUserFilterNext> registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(checkUserFilterNext);
        registrationBean.addUrlPatterns("/test/*"); //url拦截
        registrationBean.setOrder(2);
        registrationBean.setAsyncSupported(true);
        return registrationBean;
    }
}
