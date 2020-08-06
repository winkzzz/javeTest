package ph.mobile.training.extra;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();

        boolean flag = false;
        for(int i = 2; i <= num/2; i++)
        {
            // condition for composite
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is a composite number.");
    }

}
