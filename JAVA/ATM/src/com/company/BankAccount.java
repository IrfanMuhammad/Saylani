package com.company;

import java.util.Scanner;

/**
 * Created by muhammad on 7/16/2016.
 */
public class BankAccount {

    private static int balance = 50000;
    private String name = "MUHAMMAD IRFAN";
    private String address = "clifton";
    private String contact = "0300-1234567";
    int pin = 1234;
    boolean login = false;
    Scanner scan = new Scanner(System.in);

    public void login(){
        System.out.println("\n\t\t\t\tWelcome To A.B.C Bank Pvt Ltd\n");
        while(!login){
            System.out.print("\nPlease Enter Your Pin : ");
            int uPin = scan.nextInt();
            if (uPin == pin) {
                System.out.println("\n\t\t\t\t\tWELCOME " + name + "\n");
                login = true;
            } else {
                System.out.println("Incorrect Pin");
                System.out.println("TRY AGAIN");
            }
        }
    }
    public void deposit(){
        System.out.println("Please Enter Amount To Deposit !");
        int amount = scan.nextInt();
        balance = balance + amount ;
        System.out.println("Deposit Successful.");
    }
    public void withdraw(){
            System.out.println("Please Enter Amount That You Want To Withdraw!");
            int amount = scan.nextInt();
            if (amount > balance) {
                System.out.println("You Don't Have Sufficient Balance");
                System.out.println("Try Again");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawal Successful.");
            }
    }
    public void availableBalance(){

        System.out.println("Your Balance Is:  Rs." + balance);
    }
    public void userInfo(){
        System.out.println("Name: "+name+"\nContact: "+contact+"\nAddress: "+address+"\nPin: "+ pin);
        System.out.println("\nTo Update(u)\t\t\t\tTo Exit(Any Key)");
        char input = scan.next().charAt(0);
        if(input == 'u'){
            System.out.println("Name: ("+name+")");
            String uName = scan.next();
            name = uName;
            System.out.println("Address: ("+address+")");
            String uAddress = scan.next();
            address = uAddress;
            System.out.println("Contact: ("+contact+")");
            String uContact = scan.next();
            contact = uContact;
            System.out.println("Pin: ("+name+")");
            int userPin = scan.nextInt();
            pin = userPin;
            System.out.println("Updated Successfully!");
        }
    }
}
