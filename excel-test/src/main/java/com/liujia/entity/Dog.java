package com.liujia.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ex_111806190
 * @since 2020-9-21 11:21
 */
@Data
public class Dog implements Serializable {
    private String name;

    private Integer age;
}
