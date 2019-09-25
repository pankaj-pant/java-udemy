package com.company;

public class Floor {
    private Dimensions dimensions;
    private String type;

    public Floor(Dimensions dimensions, String type) {
        this.dimensions = dimensions;
        this.type = type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getType() {
        return type;
    }
}
