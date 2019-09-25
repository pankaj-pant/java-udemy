package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("=== Password validation ===");
        System.out.println("Enter username: ");
        String username = input.nextLine();
        System.out.println("Enter password: ");
        String password = input.nextLine();


    if(checkPassword(username, password) == true){
        System.out.println("Password ok");
    } else {
        System.out.println("Invalid password");
    }

    }

    public static boolean checkPassword(String username, String password){

        int passwordStrength = 0;

        if((password.length() > 5) && (password.matches(".*[0-9]{1,}.*"))){
            passwordStrength ++;
        }

        if(password.toLowerCase().contains(username.toLowerCase())){
            return false;
        } else{
            passwordStrength++;
        }

        if (passwordStrength == 2){
            return true;
        } else {
            return false;
        }

    }
}
