package ph.mobile.training.extra;

import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        int i = 0;
        // scanner here
        Scanner a = new Scanner(System.in);


        // random here
        Random random = new Random();

        // set limit to 10
        int randInt = random.nextInt(10);


        while (i < 5){

            // guess number here
            System.out.print("Guess a number between 0 - 10: ");
            int guess = a.nextInt();

            if (guess > randInt) {
                System.out.println("Your guess is too high");
            } else if (guess < randInt) {
                System.out.println("Your guess is too low");

            }
            else if (guess == randInt){
                System.out.println("Congratulations! You are correct");
                break;
            }

            i++;

        }
    }
}
