package com.manjeshk.designpattern.creational.factory;

public class Blog extends Website{
    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
    }
}
