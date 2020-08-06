package ph.mobile.training.extra;

import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {

        //item 1
        System.out.println("This is item 1");
        System.out.println("Enter number 1-7: ");
        Scanner a = new Scanner(System.in);
        int week = a.nextInt();

        if (week == 1) {
            System.out.println("Monday");
        } else if (week == 2) {
            System.out.println("Tuesday");
        } else if (week == 3) {
            System.out.println("Wednesday");
        } else if (week == 4) {
            System.out.println("Thursday");
        } else if (week == 5) {
            System.out.println("Friday");
        } else if (week == 6) {
            System.out.println("Saturday");
        } else if (week == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong input");
        }


        // item 2
        System.out.println("This is item 2");
        System.out.println("Input number 1:");
        int com1 = a.nextInt();
        System.out.println("Input number 2:");
        int com2 = a.nextInt();
        if (com1 == com2) {
            System.out.println(com1 + " is equal to " + com2);
        } else {
            System.out.println(com1 + " is not equal to " + com2);
        }

        //item 3

        System.out.println("This is item 3");
        System.out.println("Enter Quiz score: ");
        double quiz = a.nextDouble();
        System.out.println("Enter Midterm score: ");
        double mid = a.nextDouble();
        System.out.println("Enter Final score: ");
        double fin = a.nextDouble();

        double ave = (quiz+mid+fin)/3;

        if (ave >= 90){
            System.out.println("Your grade is A");
        }

        else if (ave < 90 || ave >= 70) {
            System.out.println("Your grade is B");
        }

        else if (ave < 70 || ave >= 50) {
            System.out.println("Your grade is C");
        }

        else if (ave < 50) {
            System.out.println("Your grade is F");
        }

        else {
            System.out.println("Incorrect input");
        }
    }
}

