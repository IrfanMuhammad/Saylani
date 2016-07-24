package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here

        BankAccount account = new BankAccount();
        account.login();
        boolean bool = true;
        while(bool) {
            System.out.println("\nPlease Select From A Given List.\n1. Deposit.\n2. Withdraw.\n3. Balance.\n4. User Information.\n5. Exit.");
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                    account.deposit();
                    break;
                case 2:
                    account.withdraw();
                    break;
                case 3:
                    account.availableBalance();
                    break;
                case 4:
                    account.userInfo();
                    break;
                case 5:
                    bool = false;
                    break;
                default:
                    System.out.println("you made a wrong choice!!!");
                    break;
            }
        }

    }
}
