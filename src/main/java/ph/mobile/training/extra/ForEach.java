package ph.mobile.training.extra;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        int[] multi = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter number " );
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        num += 1;
        for (int i: multi){

            if (num > i)
            {
                System.out.println("5 x " + multi[i] +" = "+(multi[i] * 5));
            }
            else
                break;
        }

    }
}
