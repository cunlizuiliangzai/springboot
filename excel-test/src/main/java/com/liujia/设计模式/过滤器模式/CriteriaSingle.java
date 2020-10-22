package com.liujia.设计模式.过滤器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ex_111806190
 * @since 2020-10-22 14:53
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
