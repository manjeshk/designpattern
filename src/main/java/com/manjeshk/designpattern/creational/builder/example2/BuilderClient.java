package com.manjeshk.designpattern.creational.builder.example2;

public class BuilderClient {
    public static void main(String[] args) {

        Beverage tea = HotelWaiter.takeOrder("tea");
        System.out.println(tea);

        Beverage coffee = HotelWaiter.takeOrder("coffee");
        System.out.println(coffee);
    }
}
