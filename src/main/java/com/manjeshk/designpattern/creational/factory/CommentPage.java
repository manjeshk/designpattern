package com.manjeshk.designpattern.creational.factory;

public class CommentPage extends Page{
    @Override
    protected void write() {
        System.out.println("Comment");
    }
}
