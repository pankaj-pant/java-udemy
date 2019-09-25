package com.company;
import java.sql.SQLOutput;
import java.util.*;

// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.

public class Hamburger {
    private String rollType;
    private String meat;
    private String lettuce;
    private String tomato;
    private String carrot;
    private String cucumber;
    private double price;


    public Hamburger(String rollType, String meat, double price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public double addLettuce() {
        return 0.50;
    }

    public double addTomato() {
        return 0.25;
    }

    public double addCarrot() {
        return 0.50;
    }

    public double addCucumber() {
        return 0.25;
    }

    public String getLettuce() {
        return lettuce;
    }

    public String getTomato() {
        return tomato;
    }

    public String getCarrot() {
        return carrot;
    }

    public String getCucumber() {
        return cucumber;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }



    public void constructBurger(int numberOfToppings){

        if (numberOfToppings > 0 && numberOfToppings < 5){
            numberOfToppings = numberOfToppings;
        } else {
            numberOfToppings = 0;
        }
        selectToppings(numberOfToppings);
    }

    public void selectToppings(int numberOfToppings){
        Scanner input = new Scanner(System.in);

        System.out.println("Number of toppings = " + numberOfToppings);
    for (int i = 1; i <= numberOfToppings; i++){
        System.out.println("Select topping #" + i + " (1 = lettuce, 2 = tomato, 3 = carrot, 4 = cucumber)");
        int userInput = Integer.parseInt(input.nextLine());
        addToppings(userInput);

    }
        System.out.println("Total price of hamburger = " + this.price + " euros");
    }

    public void addToppings(int number){
    switch (number) {
        case 1:
            System.out.println("+ Lettuce (" + addLettuce() + " euros)");
            this.price += addLettuce();
            break;
        case 2:
            System.out.println("+ Tomato (" + addTomato() + " euros)");
            this.price += addTomato();
            break;
        case 3:
            System.out.println("+ Carrot (" + addCarrot() + " euros)");
            this.price += addCarrot();
            break;
        case 4:
            System.out.println("+ Cucumber (" + addCucumber() + " euros)");
            this.price += addCucumber();
            break;
        case 5:
            System.out.println("+ Cucumber (" + addCucumber() + " euros)");
            break;
        case 6:
            System.out.println("+ Cucumber (" + addCucumber() + " euros)");
            break;
        default:
            break;
        }
    }






}
