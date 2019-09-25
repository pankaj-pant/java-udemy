package com.company;

public class Farmari extends Car {

    private int cost;
    private String fuelType;

    public Farmari(int weight, String brand, int cost, String fuelType) {
        super(weight, brand, 5, 5);
        this.cost = cost;
        this.fuelType = fuelType;
    }
}
