package com.liujia.设计模式.建造者模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 16:20
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
