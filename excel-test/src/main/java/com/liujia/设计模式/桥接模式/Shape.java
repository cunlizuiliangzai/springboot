package com.liujia.设计模式.桥接模式;

/**
 * @author ex_111806190
 * @since 2020-10-22 14:39
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
