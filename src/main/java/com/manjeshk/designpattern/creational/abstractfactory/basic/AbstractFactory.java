package com.manjeshk.designpattern.creational.abstractfactory.basic;

public abstract class AbstractFactory {



    abstract Color getColor(ColorType colorType);

    abstract Shape getShape(ShapeType shapeType);
}
