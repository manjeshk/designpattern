package com.manjeshk.designpattern.creational.abstractfactory.basic;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw() method.");
    }
}