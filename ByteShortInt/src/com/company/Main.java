package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte myByteValue = 10;

        short myShortValue = 32_700;

        //int myIntValue = 234;

        int myLongValue =  50000 + (10 * (myByteValue + myShortValue));

        System.out.println(myLongValue);
    }
}
