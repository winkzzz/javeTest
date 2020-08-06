package ph.mobile.training.encapsulation;

import com.sun.javafx.css.Declaration;

import java.util.Scanner;

public class Car_Output {
    public static void chooseCar(){
        Scanner a = new Scanner(System.in);

        // toyota fortuner
        Car car1 = new Car();
        car1.setNum(1);
        car1.setName("Toyota");
        car1.setModel("Fortuner");
        car1.setPrice(2300000.00);

        //System.out.println(car1.getNum()+ "  "+ car1.getName()+ "  "+ car1.getModel()+ "  "+car1.getPrice() );

        // Nissan Terra
        Car car2 = new Car();
        car2.setNum(2);
        car2.setName("Nissan");
        car2.setModel("Terra");
        car2.setPrice(2100000.00);
        //System.out.println(car2.getNum()+ "  "+ car2.getName()+ "  "+ car2.getModel()+ "  "+car2.getPrice() );


        // Mitsubishi Montero
        Car car3 = new Car();
        car3.setNum(3);
        car3.setName("Mitsubishi");
        car3.setModel("Montero");
        car3.setPrice(2450000.00);
        //System.out.println(car3.getNum()+ "  "+ car3.getName()+ "  "+ car3.getModel()+ "  "+car3.getPrice() );


        // Ford Everest
        Car car4 = new Car();
        car4.setNum(4);
        car4.setName("Ford");
        car4.setModel("Everest");
        car4.setPrice(2500000.00);
        //System.out.println(car4.getNum()+ "  "+ car4.getName()+ "  "+ car4.getModel()+ "  "+car4.getPrice() );
        int i = 0;


            System.out.print("Enter number of your choice: ");
            int choice = a.nextInt();

            if (choice == 1){
                System.out.println("Name: "+car1.getName());
                System.out.println("Model: "+car1.getModel());
                System.out.println("Price: "+car1.getPrice());

            }
            else if (choice == 2){
                System.out.println("Name: "+car2.getName());
                System.out.println("Model: "+car2.getModel());
                System.out.println("Price: "+car2.getPrice());
            }
            else if (choice == 3){
                System.out.println("Name: "+car3.getName());
                System.out.println("Model: "+car3.getModel());
                System.out.println("Price: "+car3.getPrice());
            }
            else if (choice == 4){
                System.out.println("Name: "+car4.getName());
                System.out.println("Model: "+car4.getModel());
                System.out.println("Price: "+car4.getPrice());
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
