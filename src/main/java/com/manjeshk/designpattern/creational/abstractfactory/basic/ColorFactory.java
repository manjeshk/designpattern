package com.manjeshk.designpattern.creational.abstractfactory.basic;

public class ColorFactory extends AbstractFactory {

    Color getColor(ColorType colorType) {
        switch (colorType) {
            case RED:
                return new Red();
            case BLUE:
                return new Blue();
            case GREEN:
                return new Green();
            default:
                return null;
        }
    }

    @Override
    Shape getShape(ShapeType shapeType) {
        return null;
    }

}