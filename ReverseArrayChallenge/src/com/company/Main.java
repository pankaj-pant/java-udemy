package com.company;

import java.util.Arrays;

/* A simple program to reverse an array */

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [] array = {5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(array));

        reverse(array);

        System.out.println(Arrays.toString(array));

    }

    private static void reverse(int [] array){

        int maxIndex = array.length -1;

        int halfwayPoint = array.length / 2;

        for (int i = 0; i < halfwayPoint; i++){
            int temp = array[i];
            array[i] = array [maxIndex - i];
            array[maxIndex - i] = temp;
        }

    }

}
