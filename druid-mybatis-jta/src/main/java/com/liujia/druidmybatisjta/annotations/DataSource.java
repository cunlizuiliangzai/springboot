package com.liujia.druidmybatisjta.annotations;
import com.liujia.druidmybatisjta.utils.DataSourceNames;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    String value() default DataSourceNames.ONE;
}
