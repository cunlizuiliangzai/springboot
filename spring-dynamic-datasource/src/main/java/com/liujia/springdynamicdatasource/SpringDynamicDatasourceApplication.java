package com.liujia.springdynamicdatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})  //禁用数据源配置
public class SpringDynamicDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDynamicDatasourceApplication.class, args);
    }

}
