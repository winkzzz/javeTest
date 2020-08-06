package ph.mobile.training.extra;

import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args){
        // declaration here
        int days = 0;

        System.out.println("Enter a number: ");
        Scanner a = new Scanner(System.in);
        int month = a.nextInt();

        switch (month){
            case 1:
                System.out.println("January");
                days = days + 31;
                System.out.println("Days: "+ days);
                break;
            case 2:
                System.out.println("February");
                days = days + 31 + 28;
                System.out.println("Days: "+ days);
                break;
            case 3:
                System.out.println("March");
                days = days + 31 + 28 + 31;
                System.out.println("Days: "+ days);
                break;
            case 4:
                System.out.println("April");
                days = days + 31 + 28 + 31 + 30;
                System.out.println("Days: "+ days);
                break;
            case 5:
                System.out.println("May");
                days = days + 31 + 28 + 31 + 30 + 31 ;
                System.out.println("Days: "+ days);
                break;
            case 6:
                System.out.println("June");
                days = days + 31 + 28 + 31 + 30 + 31 + 30 ;
                System.out.println("Days: "+ days);
                break;
            case 7:
                System.out.println("July");
                days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 ;
                System.out.println("Days: "+ days);
                break;
            case 8:
                System.out.println("August");
                days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 ;
                System.out.println("Days: "+ days);
                break;
            case 9:
                System.out.println("September");
                days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                System.out.println("Days: "+ days);
                break;
            case 10:
                System.out.println("October");
                days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                System.out.println("Days: "+ days);
                break;
            case 11:
                System.out.println("November");
                days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                System.out.println("Days: "+ days);
                break;
            case 12:
                System.out.println("December");
                days = days + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
                System.out.println("Days: "+ days);
                break;
            default:
                System.out.println("Days: "+days);
        }

    }
}
