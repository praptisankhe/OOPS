package com.oops.examples.inheritance;


public class Student extends Person {

    public Student() {
        super();
        System.out.println("Student Created");
    }

    public Student(String name) {
        super(name);
        System.out.println("Student Created with "+name);
    }
    @Override
    public void greet()
    {
        System.out.println("Greetings from Student");
    }

    public void greet(String name, int age)
    {
        System.out.println("Greetings from Student "+name + " with age "+age);
    }
}
