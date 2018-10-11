package com.manjeshk.designpattern.creational.factory;

public class Shop extends Website{
    protected void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
