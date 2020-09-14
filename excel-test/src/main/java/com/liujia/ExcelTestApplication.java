package com.liujia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ex_111806190
 * @since 2020-9-11 10:37
 */
@SpringBootApplication
@MapperScan("com.liujia.mapper")
public class ExcelTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExcelTestApplication.class, args);
    }
}
