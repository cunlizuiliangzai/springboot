package com.liujia.设计模式.抽象工厂模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 15:34
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
