package ph.mobile.training.interfaceabstraction;

import java.util.Scanner;

public class TransactionDetails implements Transaction {

    double balance = 5000.0;
    Scanner a = new Scanner(System.in);

    public double balance() {
        System.out.println("Your current balance is: "+ balance);;
        return balance;
    }

    public void deposit() {
        System.out.print("Please Enter an amount to Deposit: ");
        double depbalance = a.nextDouble();
        balance = depbalance + balance;
        System.out.println("You have successfully deposited:" +depbalance);
        System.out.println("Now your balance is: "+balance);
    }

    public void withdraw() {
        System.out.print("Please Enter an amount to Withdraw: ");
        double witbalance = a.nextDouble();
        balance = balance - witbalance;
        System.out.println("You have successfully withdraw:" +witbalance);
        System.out.println("Now your balance is: "+balance);
    }
}
