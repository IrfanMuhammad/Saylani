package com.company;

public class Main {

    public static void main(String[] args) {
	for (int i = 1; i < 100; i++){
        if(i % 2 == 0){
            if(i % 3 == 0){
                System.out.println(i + "  bar  Foo");
            }else{
                System.out.println(i + "  bar");
            }
        } else if(i % 3 == 0){
            System.out.println(i + "  Foo");
        }else{
            System.out.println(i);
        }

    }

    }
}
