package ph.mobile.training.extra;

import java.util.Scanner;

public class NestedIfElse2 {
    public static void main(String[] args){
        double sf = 150;
        Scanner a = new Scanner(System.in);
        System.out.println("Shipping Option:" );
        int option = a.nextInt();

        switch (option){
            case 1:
                sf = sf + (sf * 0.75);
                System.out.println("Shipping Option: "+ option +"Day Shipping");
                System.out.println("Shipping Rate: "+sf);
                break;
            case 2:
                sf = sf + (sf * 0.50);
                System.out.println("Shipping Option: "+ option +"Day Shipping");
                System.out.println("Shipping Rate: "+sf);
                break;
            case 3:
                sf = sf + (sf * 0.25);
                System.out.println("Shipping Option: "+ option +"Day Shipping");
                System.out.println("Shipping Rate: "+sf);
                break;
            case 4:
                System.out.println("Shipping Option: "+ option +"Day Shipping");
                System.out.println("Shipping Rate: "+sf);
                break;
            default:
                sf = 0;
                System.out.println("Invalid Shopping");
                System.out.println("Shipping Rate: "+sf);
                break;
        }

    }
}
