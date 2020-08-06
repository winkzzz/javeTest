package ph.mobile.training.extra;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //scanner here
        Scanner a = new Scanner(System.in);

        // sum and input placeholder
        double total = 0;
        double input = 0;

        do{
            // enter number here
            System.out.print("Enter a number: ");
            double num = a.nextDouble();

            //placeholder is manipulated
            total += num;
            input = num;

        }while (input != 0);
            System.out.println(total);


    }
}
