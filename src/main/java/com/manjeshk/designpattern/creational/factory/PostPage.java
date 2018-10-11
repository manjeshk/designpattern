package com.manjeshk.designpattern.creational.factory;

public class PostPage extends Page {
    @Override
    protected void write() {
        System.out.println("post");
    }
}
