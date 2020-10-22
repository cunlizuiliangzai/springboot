package com.liujia.设计模式.抽象工厂模式;

import com.liujia.设计模式.工厂模式.Circle;
import com.liujia.设计模式.工厂模式.Rectangle;
import com.liujia.设计模式.工厂模式.Shape;
import com.liujia.设计模式.工厂模式.Square;

/**
 * @author ex_111806190
 * @since 2020-10-21 15:36
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;    }
}
