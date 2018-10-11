package com.manjeshk.designpattern.creational.prototype.shallow.v2;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie)registry.createItem("movie");
        System.out.println(movie);
        System.out.println(movie.getTitle());
        movie.setTitle("Creational pattern in Java");
        System.out.println(movie);
        System.out.println(movie.getTitle());

        Movie anotherMovie = (Movie)registry.createItem("movie");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());
        anotherMovie.setTitle("Gang of Four");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());

    }
}
