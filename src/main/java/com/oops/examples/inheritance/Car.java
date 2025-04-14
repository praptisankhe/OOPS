package com.oops.examples.inheritance;

public class Car extends Vehicle {

    public void drive()
    {
        System.out.println("Car driving");
    }

    @Override
    public void startsEngine() {
//        super.startsEngine();
        System.out.println("Starting engine from car");
    }


    final int MAX_SPEED=10;
//    @Override
//    public void startEngineFinalExample()
//    {
//        System.out.println("Starting engine final");
//    }
}
