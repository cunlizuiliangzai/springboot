package com.liujia.设计模式.建造者模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 16:23
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
