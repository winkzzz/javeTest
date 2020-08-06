package ph.mobile.training.polymorph.coffeePoly;

import ph.mobile.training.inheritance.coffee.CoffeeName;

import java.util.Scanner;



public class CreateCoffee {
    public static void chooseCoffee(){
        System.out.println("Choose your coffee");
        System.out.println("1. Cappuccino");
        System.out.println("2. Latte");
        System.out.println("3. Espresso");
        System.out.println("4. Customize");

        Coffee cappuccino = new Coffee(40,40,20);
        Coffee latte = new Coffee(30,50,20);
        Coffee espresso = new Coffee(40,40,20);
        Scanner a = new Scanner(System.in);
        int choice = a.nextInt();

        if (choice == 1){
            System.out.println("One Cappuccino coming up!");
            System.out.println("Your Cappuccino has:");
            cappuccino.displayBeverage();

        }
        else if (choice == 2){
            System.out.println("One Latte coming up!");
            System.out.println("Your Latte has:");
            latte.displayBeverage();
        }
        else if (choice == 3){
            System.out.println("One Espresso coming up!");
            System.out.println("Your Espresso has:");
            espresso.displayBeverage();

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

        Coffee custom = new Coffee(coffee, milk, sugar);
        System.out.println("Customize coffee here you go!!");
        custom.displayBeverage();

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
