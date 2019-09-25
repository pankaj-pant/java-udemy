package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, (double) i));
        }

        System.out.println("**************");

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, (double) i));
        }

        System.out.println("**************");

        int count = 0;
        for(int i = 10; count < 3; i++){
            if(isPrime(i)){
                count ++;
                System.out.println(i);
//                if (count == 3){
//                    break;
//                }

            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint:  Use the break; statement to exit




    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            //System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }

}
