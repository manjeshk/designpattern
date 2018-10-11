package com.manjeshk.designpattern.creational.abstractfactory.basic;

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Red::fill() method.");
    }
}