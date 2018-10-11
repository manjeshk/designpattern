package com.manjeshk.designpattern.creational.prototype.shallow;

public class CloneFactory {

    public Animal getClone(Animal animal) throws CloneNotSupportedException {
        return animal.makeCopy();
    }
}
