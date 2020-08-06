package ph.mobile.training.polymorph.carPoly;

import ph.mobile.training.encapsulation.Car;

import java.util.Scanner;

public class ChooseCar {
    public static void chooseCar(){
        Scanner a = new Scanner(System.in);

        CarBrand car1 = new CarBrand(1,"Fortuner", 230000, "Toyota");
        CarBrand car2 = new CarBrand(2,"Terra", 2100000, "Nissan");
        CarBrand car3 = new CarBrand(3,"Montero", 2450000, "Mitsubishi");
        CarBrand car4 = new CarBrand(4,"Everest", 2500000, "Ford");

        System.out.print("Enter number of your choice: ");
        int choice = a.nextInt();

        if (choice == 1){
            car1.displayCar();
        }
        else if (choice == 2){
            car2.displayCar();
        }
        else if (choice == 3){
            car3.displayCar();
        }
        else if (choice == 4){
            car4.displayCar();
        }
        else {
            System.out.println("No car selected");
        }
    }



    public static void main(String[] args) {
        chooseCar();

        Scanner a = new Scanner(System.in);

        int j = 0;

        while (j < 1) {
            System.out.print("Do you want to try again?(Y/N)  " );
            String input = a.nextLine();
            String i = input;
            if (i.equalsIgnoreCase("y")) {
                chooseCar();
            } else if (i.equalsIgnoreCase("n")) {
                System.out.println("Thank you come again soon");
                j++;
            }
        }
    }
}