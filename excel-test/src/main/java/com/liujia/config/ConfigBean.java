package com.liujia.config;

import lombok.Data;

/**
 * @author ex_111806190
 * @since 2020-9-21 16:35
 */
@Data
public class ConfigBean {
    private String id;

    public ConfigBean(String id) {
        this.id = id;
    }
}
