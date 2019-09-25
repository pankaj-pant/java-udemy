//Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//
//        The method should not return any value (hint: void)
//
//        Using a switch statement print ÅgSundayÅh, ÅgMondayÅh, Åc ,ÅgSaturdayÅh if
//        the int parameter ÅgdayÅh is 0, 1, Åc , 6 respectively, otherwise it should print ÅgInvalid dayÅh.
//
//        Bonus:
//        Write a second solution using if then else, instead of using switch.
//        Create a new project in IntelliJ with the  name ÅgDayOfTheWeekChallengeÅh


        package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printDayOfTheWeek(1);
    }

    public static void printDayOfTheWeek(int day){

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
