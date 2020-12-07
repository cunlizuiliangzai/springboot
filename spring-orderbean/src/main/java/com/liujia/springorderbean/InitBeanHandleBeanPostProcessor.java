package com.liujia.springorderbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitBeanHandleBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanInitOrder){
            System.out.println("执行BeanPostProcessor的postProcessBeforeInitialization方法");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanInitOrder){
            System.out.println("执行BeanPostProcessor的postProcessAfterInitialization方法");
        }
        return bean;
    }
}
