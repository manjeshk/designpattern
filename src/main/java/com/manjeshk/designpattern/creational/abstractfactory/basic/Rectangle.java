package com.manjeshk.designpattern.creational.abstractfactory.basic;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw() method.");
    }
}
