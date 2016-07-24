package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter number for star pattern");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
