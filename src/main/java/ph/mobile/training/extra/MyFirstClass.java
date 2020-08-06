package ph.mobile.training.extra;

import java.util.Scanner;


public class MyFirstClass {
    private static int var = 5;

    public static void main(String[] args){


     // THIS IS FOR NUMBER 1
    var = var + 15;

    // THIS IS FOR NUMBER 2
     Scanner varX = new Scanner(System.in);
     System.out.println("Enter X: ");

     double var1 = varX.nextDouble();
     System.out.println("Text = " + var1);

     System.out.println("Enter Y: ");

     double var2 = varX.nextDouble();
     System.out.println("Text = " + var2);
     double var3 = var1 + var2;

     System.out.println("The sum of X and y is:" + var3);
}
}
