package com.liujia.设计模式.装饰器模式;

/**
 * @author ex_111806190
 * @since 2020-10-22 15:08
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
