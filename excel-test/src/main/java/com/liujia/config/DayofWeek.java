package com.liujia.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 配置整个文件读取方便
 * @author ex_111806190
 * @since 2020-9-17 9:59
 */
@Component
@ConfigurationProperties(prefix = "dayofweek")
@Data
public class DayofWeek {

    private List<String> week;
}
