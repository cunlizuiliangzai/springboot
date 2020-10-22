package com.liujia.设计模式.过滤器模式;

import java.util.List;

/**
 * @author ex_111806190
 * @since 2020-10-22 14:50
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
