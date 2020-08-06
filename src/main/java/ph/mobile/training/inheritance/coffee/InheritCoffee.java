package ph.mobile.training.inheritance.coffee;

import java.util.Scanner;

public class InheritCoffee {
    public static void chooseCoffee(){
        CoffeeName coffee = new CoffeeName();

        System.out.println("Choose your coffee");
        System.out.println("1. Cappuccino");
        System.out.println("2. Latte");
        System.out.println("3. Espresso");
        System.out.println("4. Customize");

        Scanner a = new Scanner(System.in);
        int choice = a.nextInt();

            if (choice == 1){
                coffee.cappuccino();

            }
            else if (choice == 2){
                coffee.latte();

            }
            else if (choice == 3){
                coffee.espresso();

            }
            else if (choice == 4){
                createCoffee();
            }
            else {
                System.out.println("Not available!!");


            }

    }

    public static void createCoffee(){
        int coffee = 0;
        int milk= 0;
        int sugar= 0;

        int total;
        do{
           Scanner a = new Scanner(System.in);
           System.out.print("Enter Coffee %:  ");
           coffee = a.nextInt();
           System.out.print("Enter Milk %:  ");
           milk = a.nextInt();
           System.out.print("Enter Sugar %:  ");
           sugar = a.nextInt();

           total = coffee + milk + sugar;
           if (total != 100){
               System.out.println("Try Again");
           }
           else{
               // do nothing
           }

       }while (total != 100);

        CoffeeName cust = new CoffeeName();
        cust.setCoffee(coffee,milk,sugar);
        System.out.println("Customize coffee here you go!!");
        System.out.println("Coffee: "+cust.getCoffee()+ "%");
        System.out.println("Milk: "+cust.getMilk()+ "%");
        System.out.println("Sugar: "+cust.getSugar()+ "%");

    }



    public static void main(String[] args) {

        chooseCoffee();
        Scanner a = new Scanner(System.in);

        int j = 0;
        while (j < 1) {
            System.out.print("Do you want to try again?(Y/N)  " );
            String input = a.nextLine();
            String i = input;
            if (i.equalsIgnoreCase("y")) {
                chooseCoffee();
            } else if (i.equalsIgnoreCase("n")) {
                System.out.println("Thank you come again soon");
                j++;
            }
        }

    }
}
