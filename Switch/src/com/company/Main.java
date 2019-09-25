package com.company;

/* 
Simple program demonstrating on how to use a switch statement.
*/

public class Main {

    public static void main(String[] args) {
	// write your code here

        char charValue = 'C';

        switch (charValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("It was A, B, C, D or E");
                System.out.println("Actually it was " + charValue);
                break;

            default:
                System.out.println("It was not A, B, C, D or E");
                break;
        }



    }
}
