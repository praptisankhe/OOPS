package com.oops.examples.polymorphism;

public class Calculator {

    public void add(int a, int b) {
        int sum= a+b;
        System.out.println("Adding " + a + " and " + b +" sum "+sum);
    }

    public void add(int a, int b, int c) {
        int sum= a+b+c;
        System.out.println("Adding " + a + " and " + b + " and " + c+" sum "+sum);
    }

    public void add(Double a, Double b) {
        double sum= a+b;
        System.out.println("Adding " + a + " and " + b +" from Double"+" sum "+sum);
    }

    public void add(Double a, int b)
    {
        double sum= a+b;
        System.out.println("Adding " + a + " and " + b + "from Double and int" +" sum "+sum);
    }



}
