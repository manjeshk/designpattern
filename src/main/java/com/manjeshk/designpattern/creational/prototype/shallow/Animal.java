package com.manjeshk.designpattern.creational.prototype.shallow;

public interface Animal extends Cloneable{

    public Animal makeCopy() throws CloneNotSupportedException;
}
