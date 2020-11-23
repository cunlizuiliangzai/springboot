package com.liujia.druidmybatisjta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * jta-atomikos  分布式事务
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DruidMybatisJtaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DruidMybatisJtaApplication.class, args);
    }

}
