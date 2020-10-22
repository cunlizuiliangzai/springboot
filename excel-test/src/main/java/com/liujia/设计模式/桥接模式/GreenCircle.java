package com.liujia.设计模式.桥接模式;

/**
 * @author ex_111806190
 * @since 2020-10-22 14:38
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
