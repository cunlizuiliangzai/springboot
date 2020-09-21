package com.liujia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author ex_111806190
 * @since 2020-9-11 10:37
 */
//导入spring配置文件并指定位置
//@ImportResource(locations = {"classpath:bean.xml"})
@SpringBootApplication
@MapperScan("com.liujia.mapper")
public class ExcelTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExcelTestApplication.class, args);
    }
}
