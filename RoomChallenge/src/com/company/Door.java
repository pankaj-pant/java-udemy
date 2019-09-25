package com.company;

public class Door {
    int numberOfDoors;

    public Door(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openDoor(){
        System.out.println("Opening the door...");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
