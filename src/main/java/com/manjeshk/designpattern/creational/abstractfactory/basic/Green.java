package com.manjeshk.designpattern.creational.abstractfactory.basic;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Green::fill() method.");
    }
}