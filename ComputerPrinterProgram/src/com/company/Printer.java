package com.company;

// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the tonerLevel Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the tonerLevel (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean isDuplexPrinter;


    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpToner(){

        System.out.println("Current toner level is " +  this.tonerLevel +". Filling up toner... ");
        this.tonerLevel = 100;
        System.out.println("Toner level is now " + this.tonerLevel);
    }

    public void print(int numberOfPages){
        System.out.println("Printing " + numberOfPages + " page(s)...");
        this.pagesPrinted += numberOfPages;
        System.out.println("Pages printed so far " + this.pagesPrinted);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
