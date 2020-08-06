package ph.mobile.training.extra;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        String p1 = Player1();
        String p2 = Randomizer();

        System.out.println("Player 1: "+p1);
        System.out.println("Player 2: "+p2);
        Compare(p1, p2);
    }

    // player 1 choice
    public static String Player1(){
        System.out.print("Player 1: ");
        Scanner a = new Scanner(System.in);
        String p1 = a.nextLine();
        int i = 0;
        while (i < 1){
            if (p1.equalsIgnoreCase("Rock") ){
                i++;
            }

            else if (p1.equalsIgnoreCase("Paper"))
                i++;
            else if (p1.equalsIgnoreCase("Scissor"))
                i++;
            else{
                System.out.print("Player 1: ");
                p1 = a.nextLine();
            }
        }
        return p1;
    }

    // player 2 randomizer
    public static String Randomizer(){
        String[] choices = {"Rock", "Paper", "Scissor"};

        Random random = new Random();
        String p2 = choices[random.nextInt(choices.length)];
        //System.out.println("p2 here "+p2);

        return p2;

    }

    // Compare p1 and p2
    public static void Compare(String p1, String p2){
        //if tie
        if(p1.equalsIgnoreCase(p2))
            System.out.println("Its a draw!");

        // if p1 is rock
        else if (p1.equalsIgnoreCase("Rock")){
            if (p2.equalsIgnoreCase("Scissor"))
                System.out.println("Player 1 wins!");
            else if (p2.equalsIgnoreCase("Paper"))
                System.out.println("Player 2 wins!");
        }

        //if p1 is paper
        else if (p1.equalsIgnoreCase("Paper")){
            if (p2.equalsIgnoreCase("Scissor"))
                System.out.println("Player 2 wins!");
            else if (p2.equalsIgnoreCase("Rock"))
                System.out.println("Player 1 wins!");
        }

        //if p1 is scissor
        else if (p1.equalsIgnoreCase("Scissor")){
            if (p2.equalsIgnoreCase("Rock"))
                System.out.println("Player 2 wins!");
            else if (p2.equalsIgnoreCase("Paper"))
                System.out.println("Player 1 wins!");
        }

    }

}
