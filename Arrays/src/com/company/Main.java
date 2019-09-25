package com.company;
import java.util.*;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

public class Main {

    public static void main(String[] args) {


	int[] firstArray = new int[5];
	firstArray = getIntegers(5);
	printArray(firstArray);
	System.out.println("*******");
	printArray(sortIntegers(firstArray));
        System.out.println("*******");
        printArray(firstArray);


    }

    public static int[] getIntegers(int number){
        Scanner input = new Scanner(System.in);
        int[] array = new int[number];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter number: ");
            array[i] = Integer.parseInt(input.nextLine());
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ", Value = " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int [] sortedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(sortedArray);
        return sortedArray;

    }


}


