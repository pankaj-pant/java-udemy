package com.company;

/* 
Program for converting pounds into kg.
*/

public class Main {

    public static void main(String[] args) {
	// write your code here

        double pounds = 200d;

        double conversion = 0.45359237d;

        double weightInKilos = pounds * conversion;

        System.out.println(pounds + " pounds is " + weightInKilos + " kg.");
    }
}
