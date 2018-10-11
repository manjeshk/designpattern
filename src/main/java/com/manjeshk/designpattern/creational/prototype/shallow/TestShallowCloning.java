package com.manjeshk.designpattern.creational.prototype.shallow;

import com.manjeshk.designpattern.creational.prototype.shallow.CloneFactory;
import com.manjeshk.designpattern.creational.prototype.shallow.Sheep;

public class TestShallowCloning {
    public static void main(String[] args) {
        try {
            CloneFactory cloneFactory = new CloneFactory();
            Sheep sheep = new Sheep();
            Sheep clonedSheep = (Sheep) cloneFactory.getClone(sheep);
            System.out.println(sheep);
            System.out.println(clonedSheep);

            System.out.println("Sally Hashcode: " + System.identityHashCode(sheep));
            System.out.println("Cloned Hashcode: " + System.identityHashCode(clonedSheep));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
