package com.company;

public class Fibonacci {
    //private int numbers;


    public int[] getNumbers(int number) {
        int[] array = new int[number];
        array[0] = 0;
        array[1] = 1;
        for(int i = 2; i < array.length; i++){
            array[i] = array[i-2] + array[i-1];
        }
        return array;
    }
}
