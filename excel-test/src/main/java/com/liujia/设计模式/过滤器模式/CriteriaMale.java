package com.liujia.设计模式.过滤器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ex_111806190
 * @since 2020-10-22 14:51
 */
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
