package com.company;

public class Wall {
    private Dimensions dimensions;
    private String color;

    public Wall(Dimensions dimensions, String color) {
        this.dimensions = dimensions;
        this.color = color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }
}

