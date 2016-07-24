package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Human {
    private String subject;
    Scanner scan = new Scanner(System.in);

    public Student() {
    }

    public Student(int id, String name, int age, String subject) {
        super.setId(id);
        super.setAge(age);
        super.setName(name);
        this.setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;

    }

    public void add() {
        super.add();
        System.out.print("\nPlease Enter Student Subject : ");
        setSubject(scan.next());
    }

    public void studentManagement() {
        ArrayList<Student> student = new ArrayList<Student>();
        Student std = new Student();
        boolean bool = true;
        while (bool) {
            System.out.println("\nPlease Select Form A Given List\n\n" + "1. Add Student.\n2. Student List.\n" +
                    "3. Search Student.\n" + "4. Update Student.\n" + "5. Delete Student.\n6. Exit.");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    std.add();
                    student.add(new Student(std.idGenerator(), std.getName(), std.getAge(), std.getSubject()));
                    System.out.println("Student Record Added Successfully");
                    break;
                case 2:
                    System.out.println("Student ID\t\tStudent Name\t\tStudent Age\t\tStudent Subject");
                    System.out.println("--------------------------------------------------------------------");
                    for (Student s : student) {
                        System.out.println(s.getId() + "\t\t\t\t" + s.getName() + "\t\t\t\t" + s.getAge() + "\t\t\t\t" + s.getSubject());
                    }
                    break;
                case 3:
                    System.out.println("Please Enter Student ID To Search Student Record");
                    int id = scan.nextInt();
                    if (id <= student.size() & id > 0) {
                        Student searchStudent = new Student();
                        searchStudent = student.get(id - 1);
                        System.out.println("Student Name : " + searchStudent.getName());
                        System.out.println("Student Age : " + searchStudent.getAge());
                        System.out.println("Student Subject : " + searchStudent.getSubject());
                    } else {
                        System.out.println("Student Record Associated With ID: " + id + " Is Not Availabe.");
                    }
                    break;
                case 4:
                    System.out.println("Please Enter Student ID To Update Student Record");
                    id = scan.nextInt();
                    if (id <= student.size() & id > 0) {
                        Student searchStudent = new Student();
                        searchStudent = student.get(id - 1);
                        System.out.println("Please Update Record For The Student");
                        std.add();
                        searchStudent.setName(std.getName());
                        searchStudent.setAge(std.getAge());
                        searchStudent.setSubject(std.getSubject());
                        System.out.println("Student Record Updated Successfully");
                    } else {
                        System.out.println("Student Record Associated With ID: " + id + " Is Not Availabe.");
                    }
                    break;
                case 5:
                    System.out.println("Please Enter Student ID To Delete Student Record");
                    id = scan.nextInt();
                    if (id <= student.size() & id > 0) {
                        student.remove(id - 1);
                        System.out.println("Student Record Associated With ID : " + id + " Deleted successfully !");
                    } else {
                        System.out.println("Student Record Associated With ID: " + id + " Is Not Availabe.");
                    }
                    break;
                case 6:
                    bool = false;
                    break;
                default:
                    System.out.println("you made wrong Choice");
                    break;
            }
        }
    }
}