package com.company;

import java.util.Scanner;

public class Human {
    private int id = 0 ;
    private String name;
    private int age;

    Scanner scan = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void add(){
        System.out.print("\nPlease Enter Name : ");
        setName(scan.next());
        System.out.print("\nPlease Enter Age : ");
        setAge(scan.nextInt());
    }

    public int idGenerator(){
        id++;
        return id;
    }
}
