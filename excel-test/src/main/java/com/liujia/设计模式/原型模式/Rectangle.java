package com.liujia.设计模式.原型模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 16:35
 */
public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
