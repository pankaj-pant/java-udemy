package com.company;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(3, 5);
        Wall wall = new Wall(dimensions, "white");
        Floor floor = new Floor(dimensions, "laminate");
        Ceiling ceiling = new Ceiling(dimensions);
        Door door = new Door(1);
        Windowss windows = new Windowss(2);
        Furniture furniture = new Furniture("table", "chair", "bed");

        Room room = new Room(wall, floor, ceiling, door, windows, furniture);

        room.enterRoom();
        room.describeRoom();

        room.getWindows().openWindows();
        System.out.println("**********");
        room.openWindows();

    }
}
