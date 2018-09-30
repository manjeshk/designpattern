package com.manjeshk.designpattern.creational.singleton;

public class Threadsafe {

    private static volatile Threadsafe instance = null;

    private Threadsafe() {
        if (instance != null)
            throw new RuntimeException("Use getInstance() method to create.");
    }

    public static Threadsafe getInstance() {
        if (instance == null) {
            synchronized (Threadsafe.class) {
                if (instance == null)
                    instance = new Threadsafe();
            }
        }

        return instance;
    }

}
