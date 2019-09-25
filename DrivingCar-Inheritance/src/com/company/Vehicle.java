package com.company;

public class Vehicle {

    private String type;
    private int weight;

    public Vehicle(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public void move(int speed){
        if (speed <= 0){
            System.out.println("Vehicle is stationary");
        } else {
            System.out.println("Vehicle is moving at " + speed + " km/h");
        }
    }

}
