package com.oops.examples.inheritance;

public class Person {

    public Person() {
        System.out.println("Person Created");
    }

    public Person(String name) {
        System.out.println("Person Created with "+name);
    }

    public void greet()
    {
        System.out.println("Greetings from Person");
    }

    public void greet(String name)
    {
        System.out.println("Greetings from Person "+name);
    }
}
