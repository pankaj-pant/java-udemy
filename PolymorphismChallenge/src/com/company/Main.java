package com.company;
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Starting engine....";
    }

    public String accelerate(){
        return "Accelerating...";
    }

    public String brake(){
        return "Braking...";
    }
}

class Tesla extends Car {
    public Tesla(int cylinders, String name) {
        super(8, "Tesla");
    }

    @Override
    public String accelerate() {
        return "Super acceleration mode...";
    }

    @Override
    public String startEngine() {
        return "Always on...";
    }

    @Override
    public String brake() {
        return "Regenerative braking...";
    }
}

class Renault extends Car{
    public Renault(int cylinders, String name) {
        super(2, "Renault");
    }
}

public class Main {

    public static void main(String[] args) {

        Tesla Tesla = new Tesla(4,"Tesla");
        Renault Renault = new Renault(2, "Renault");
        System.out.println("Tesla is " + Tesla.startEngine());
        System.out.println("In a Renault, you have to turn the key to " + Renault.startEngine());
        System.out.println("A Tesla has " + Tesla.getCylinders() + " cylinders.");


    }


}
