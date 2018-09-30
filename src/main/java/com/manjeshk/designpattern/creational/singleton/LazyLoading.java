package com.manjeshk.designpattern.creational.singleton;

public class LazyLoading {

    private static LazyLoading instance = null;

    private LazyLoading() {
    }

    public static LazyLoading getInstance() {
        if (instance == null)
            instance = new LazyLoading();

        return instance;
    }

}
