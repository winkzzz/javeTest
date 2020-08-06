package ph.mobile.training.abstraction;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        mainATM();

    }

    private static void mainATM() {
        Scanner a = new Scanner(System.in);
        TransactionDetails atm = new TransactionDetails();
        System.out.println("Welcome to HC bank");
        System.out.print("Please Enter your PIN:");
        int pin = a.nextInt();
        System.out.println("Winky Dionisio");
        System.out.println("Please choose the following options");
        System.out.println("1 - Show Balance");
        System.out.println("2 - Deposit Amount");
        System.out.println("3 - Withdraw Amount");
        pin = a.nextInt();

        if (pin == 1) {
            atm.balance();
        } else if (pin == 2) {
            atm.deposit();
        } else if (pin == 3) {
            atm.withdraw();
        } else {
            System.out.println("Try again");
            mainATM();
        }
    }
}
