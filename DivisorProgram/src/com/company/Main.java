package com.company;

import java.util.Scanner;

/* 
A program for calculating total number of divisors a positive integer has.
*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter a positive integer: ");
            int userInput = Integer.parseInt(input.nextLine());
            System.out.println();

            if(userInput > 0){
                int divisorCount = 0;
                for(int i = 1; i <= userInput; i++){
                    if((userInput % i) == 0){
                        divisorCount ++;
                    }
                }
                System.out.println(userInput + " has " + divisorCount + " divisors");
            } else {
                System.out.println("The input is not a positive integer.");
            }


        } catch (NumberFormatException nfe){
            System.out.println("\nThe input is not a positive integer.");
        }

    }
}
