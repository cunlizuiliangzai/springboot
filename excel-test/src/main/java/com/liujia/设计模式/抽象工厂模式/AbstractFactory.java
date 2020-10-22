package com.liujia.设计模式.抽象工厂模式;

import com.liujia.设计模式.工厂模式.Shape;

/**
 * @author ex_111806190
 * @since 2020-10-21 15:35
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
