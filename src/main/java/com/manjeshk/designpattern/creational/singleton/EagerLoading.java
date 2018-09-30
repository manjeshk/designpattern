package com.manjeshk.designpattern.creational.singleton;

public class EagerLoading {

    private static EagerLoading instance = new EagerLoading();

    private EagerLoading(){}

    public static EagerLoading getInstance(){
        return instance;
    }

}
