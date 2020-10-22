package com.liujia.entity;

import com.liujia.entity.Dog;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *  prefix不支持驼峰命名和蛇形命名
 *
 *  @Value 不支持复杂对象，不支持数据校验，不支持松散语法绑定，支持SpEL- Spring Express Language一个个传值
 *  ConfigurationProperties  支持松散语法绑定，支持数据校验，支持复杂对象，不支持SpEL表达式，适合整体传值
 *
 *  application.yml  主配置文件有person，优先取主配置文件值，没有才取person.properties
 *
 * @author ex_111806190
 * @since 2020-9-21 11:17
 */

@PropertySource(value = {"classpath:person.properties"},encoding = "UTF-8")
@ConfigurationProperties(prefix = "person")
@Component
@Data
//@Validated
public class Person implements Serializable {

//    @Email
    private String lastName;

//    @Value("#{11*2}")
    private Integer age;

//    @Value("true")
    private Boolean boss;

//    @Value("${person.birth}")
    private Date birth;

    //泛型要写，不然启动报错
    private Map<String,Object> maps;

    private List<Object> lists;

    private Dog dog;


}
