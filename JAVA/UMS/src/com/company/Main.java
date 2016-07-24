package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        Scanner scan = new Scanner(System.in);
        boolean bool = true;
        while(bool){
            System.out.println("\n\t\t\t\tWelcome To ABC University\n\n");
            System.out.println("Please Select From Given List.\n\n1. Student Management.\n2. Teacher Management.\n3. Exit.");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    student.studentManagement();
                    break;
                case 2:
                    teacher.teacherManagement();
                    break;
                case 3:
                    bool = false;
                    break;
                default:
                    System.out.println("you made a wrong choice");
            }
        }
    }
}
