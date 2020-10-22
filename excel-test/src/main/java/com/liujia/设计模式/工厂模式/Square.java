package com.liujia.设计模式.工厂模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 15:22
 * 正方形
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
