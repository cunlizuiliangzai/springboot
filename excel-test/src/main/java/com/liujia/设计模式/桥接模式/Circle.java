package com.liujia.设计模式.桥接模式;

/**
 * @author ex_111806190
 * @since 2020-10-22 14:40
 */
public class Circle extends Shape{

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
