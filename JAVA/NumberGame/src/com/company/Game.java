package com.company;

import java.util.Random;
import java.util.Scanner;



public class Game {

    Scanner scan = new Scanner(System.in);

    public void numberGame(int credits) {
        int count = 0;
        if (credits == 0) {
            count = 3;
        } else {
            count = credits;
        }
        int userGuess = 0;
        for (int i = 0; i < count; i++) {
            Random number = new Random();
            int randNumber = number.nextInt(10);
            if (randNumber == 0) {
                randNumber++;
            }
            boolean checkNumber = true;
            while (checkNumber) {
                System.out.println("Please Guess Number from 1 - 10");
                userGuess = scan.nextInt();

                if ((userGuess < 1) || (userGuess > 10)) {
                    System.out.println("This Number Is Not In A given Range\n");
                } else {
                    checkNumber = false;
                }
            }
            if (userGuess == randNumber) {
                System.out.println("YOU WIN!!!!!\n");
            } else {
                System.out.println("YOU LOOSE!!!!!\n");
            }
        }
    }
}
