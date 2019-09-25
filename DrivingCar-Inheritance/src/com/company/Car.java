package com.company;

// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.

public class Car extends Vehicle {

    private String brand;
    private int doors;
    private int seats;

    public Car(int weight, String brand, int doors, int seats) {
        super("Car", weight);
        this.brand = brand;
        this.doors = doors;
        this.seats = seats;
    }

    public void steer(){
        System.out.println("The driver is steering the car.");
    }

    public void changeGear(int gear){
        if(gear < 0){
            System.out.println("Car is in neutral.");
        } else if (gear < 7) {
            System.out.println("Car is in gear " + gear);
        } else {
            System.out.println("Car is in highest gear");
        }

    }



}
