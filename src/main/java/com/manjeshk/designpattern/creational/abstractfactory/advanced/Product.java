package com.manjeshk.designpattern.creational.abstractfactory.advanced;

public abstract class Product {

    protected int name;
    protected int price;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
