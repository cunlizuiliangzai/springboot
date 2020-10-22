package com.liujia.设计模式.抽象工厂模式;

import com.liujia.设计模式.工厂模式.Shape;

/**
 * @author ex_111806190
 * @since 2020-10-21 15:37
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
