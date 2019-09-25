package com.company;

public class Room {
    private Wall wall;
    private Floor floor;
    private Ceiling ceiling;
    private Door door;
    private Windowss windows;
    private Furniture furniture;

    public Room(Wall wall, Floor floor, Ceiling ceiling, Door door, Windowss windows, Furniture furniture) {
        this.wall = wall;
        this.floor = floor;
        this.ceiling = ceiling;
        this.door = door;
        this.windows = windows;
        this.furniture = furniture;
    }



    public void enterRoom(){
        door.openDoor();
        System.out.println("Entering room...");
    }

    public void describeRoom(){
        System.out.println("Describe the room...");
        furniture.describeObjects();
    }

    public void openWindows(){
        windows.openWindows();
    }

    public Wall getWall() {
        return wall;
    }

    public Floor getFloor() {
        return floor;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Door getDoor() {
        return door;
    }

    public Windowss getWindows() {
        return windows;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
