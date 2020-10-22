package com.liujia.设计模式.抽象工厂模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 15:33
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
