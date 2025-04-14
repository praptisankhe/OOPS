package com.oops.examples.inheritance;

public class Dogg extends Animal {
    public Dogg() {
        super();
        System.out.println("Dogg created");

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("DOG Barks bhow bhow");
    }
}
