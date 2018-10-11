package com.manjeshk.designpattern.creational.abstractfactory.basic;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Blue::fill() method.");
    }
}