package com.liujia.设计模式.原型模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 16:37
 */
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }


    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
