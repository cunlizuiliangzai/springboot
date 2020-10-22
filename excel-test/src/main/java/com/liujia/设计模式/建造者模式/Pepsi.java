package com.liujia.设计模式.建造者模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 16:24
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
