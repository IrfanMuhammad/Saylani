package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberCount = 0;
	    System.out.println("Do You Want To Play Game\n" +
                "Press 'y' For yes And Any Other Key For No");
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.next();

        if(userChoice.equals("y")) {
            Game game = new Game();
            game.numberGame(numberCount);
            System.out.println("Trial version is Finished.");
            System.out.println("If You Want To Play More, You Need Credits \n" +
                    "Press 'y' For Play More And Any Other Key For Exit");
            userChoice = scan.next();
            if(userChoice.equals("y")){
                System.out.println("Please Enter Credits From 1 - 10");
                numberCount = scan.nextInt();
                game.numberGame(numberCount);
            }
        }
        System.out.println("Good Bye!");
    }
}
