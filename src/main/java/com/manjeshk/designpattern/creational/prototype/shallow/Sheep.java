package com.manjeshk.designpattern.creational.prototype.shallow;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is made");
    }

    public Animal makeCopy() throws CloneNotSupportedException {
        System.out.println("Sheep is being made");
        Sheep sheep = (Sheep) super.clone();

        return sheep;
    }


    public String toString(){
        return "Dolly is my hero";
    }

}
