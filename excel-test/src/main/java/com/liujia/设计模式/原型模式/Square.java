package com.liujia.设计模式.原型模式;

/**
 * @author ex_111806190
 * @since 2020-10-21 16:36
 */
public class Square extends Shape{

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
