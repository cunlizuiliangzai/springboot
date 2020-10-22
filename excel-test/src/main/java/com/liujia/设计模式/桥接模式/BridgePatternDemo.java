package com.liujia.设计模式.桥接模式;

/**
 * @author ex_111806190
 * @since 2020-10-22 14:42
 */
public class BridgePatternDemo {

    /**
     *  Drawing Circle[ color: red, radius: 10, x: 100, 100]
     * Drawing Circle[  color: green, radius: 10, x: 100, 100]
     */
    public static void main(String[] args) {
        Circle redCircle = new Circle(100,100, 10, new RedCircle());
        Circle greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }
}
