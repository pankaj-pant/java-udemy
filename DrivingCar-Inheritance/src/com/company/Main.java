package com.company;

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.


public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Car", 4000);

        Farmari farmari1 = new Farmari(3000, "Renault", 16000, "Petrol");

        farmari1.changeGear(0);
        farmari1.move(0);
        farmari1.changeGear(1);
        farmari1.move(5);
        farmari1.changeGear(2);
        farmari1.move(15);
        farmari1.changeGear(3);
        farmari1.move(30);
        farmari1.changeGear(4);
        farmari1.move(50);
        farmari1.steer();





    }
}
