package com.liujia.设计模式.建造者模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 16:22
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
