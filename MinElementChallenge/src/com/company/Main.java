package com.company;
import java.util.*;

//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//        -Finally, print the minimum element in the array.
//
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//        -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name ÅeMinElementChallengeÅf


public class Main {

   public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[]array = readIntegers(5);
        System.out.println(findMin(array));

    }


    public static int[] readIntegers(int count){
    int[] array = new int[count];
        System.out.println("Enter integers: ");
    for(int i =0; i< array.length; i++){
        array[i] = Integer.parseInt(input.nextLine());
    }
    return array;
    }

    public static int findMin(int[] array){
    int min = array[0];
    for (int i = 1; i < array.length; i++){
        if(min > array[i]){
            min = array[i];
        }
    }
    return min;

    }
}
