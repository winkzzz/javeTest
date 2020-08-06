package ph.mobile.training.extra;


import ph.mobile.training.casting.Animal;
import ph.mobile.training.casting.Cat;

import java.util.Scanner;

public class DataType {

    public static void main (String[] args) {
        /**  // Scanner here
         System.out.println("Enter a:");
         Scanner val = new Scanner(System.in);
         int var1 = val.nextInt();

         System.out.println("Enter b:");
         val = new Scanner(System.in);
         int var2 = val.nextInt();

         // output here
         System.out.println("The result of adding is:" +(var1+var2));
         System.out.println("The result of subtracting is:" +(var1-var2));
         System.out.println("The result of multiplying is:" +(var1*var2));

         // change to double
         double var3 = var1;
         double var4 = var2;
         System.out.println("The result of dividing is:" +(var3/var4));
         **/


         Animal animal = new Animal();
         Cat cat = new Cat();

         //upcasting
         Animal catAnimal = cat;
         catAnimal.eat();


         //downcasting
         if(catAnimal instanceof Cat) {
         ((Cat) catAnimal).meow();
         }

         //parsing
         String intVal = "10";
         int x = Integer.parseInt(intVal);

    }
}
