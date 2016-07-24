package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Human{

    private String qualification;
    Scanner scan = new Scanner(System.in);

    public Teacher(){}

    public Teacher(int id, String name, int age, String qualification){
        super.setId(id);
        super.setName(name);
        super.setAge(age);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void add(){
        super.add();
        System.out.print("\nPlease Enter Teacher Qualification : ");
        setQualification(scan.next());
    }

    public void teacherManagement(){
        ArrayList<Teacher> teacher = new ArrayList<Teacher>();
        Teacher teach = new Teacher();
        boolean bool = true;
        while(bool) {
            System.out.println("\nPlease Select Form A Given List\n\n" + "1. Add Teacher.\n2. Teacher List.\n"+
                    "3. Search Teacher.\n" + "4. Update Teacher.\n" + "5. Delete Teacher.\n6. Exit.");
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    teach.add();
                    teacher.add(new Teacher(teach.idGenerator(),teach.getName(),teach.getAge(),teach.getQualification()));
                    System.out.println("Teacher Record Added Successfully");
                    break;
                case 2:
                    System.out.println("Teacher ID\t\tTeacher Name\t\tTeacher Age\t\tTeacher Subject");
                    System.out.println("--------------------------------------------------------------------");
                    for (Teacher t : teacher) {
                        System.out.println(t.getId()+ "\t\t\t\t"+ t.getName() + "\t\t\t\t"+ t.getAge() +"\t\t\t\t"+ t.getQualification() );
                    }
                    break;
                case 3:
                    System.out.println("Please Enter Teacher ID To Search Teacher Record");
                    int id = scan.nextInt();
                    if(id <= teacher.size() & id > 0) {
                        Teacher searchTeacher = new Teacher();
                        searchTeacher = teacher.get(id - 1);
                        System.out.println("Teacher Name : " + searchTeacher.getName());
                        System.out.println("Teacher Age : " + searchTeacher.getAge());
                        System.out.println("Teacher Qualification : " + searchTeacher.getQualification());
                    }else{
                        System.out.println("Teacher Record Associated With ID: "+id+" Is Not Availabe.");
                    }
                    break;
                case 4:
                    System.out.println("Please Enter Teacher ID To Update Teacher Record");
                    id = scan.nextInt();
                    if(id <= teacher.size() & id > 0) {
                        Teacher searchTeacher = new Teacher();
                        searchTeacher = teacher.get(id - 1);
                        System.out.println("Please Update Record For The Teacher");
                        teach.add();
                        searchTeacher.setName(teach.getName());
                        searchTeacher.setAge(teach.getAge());
                        searchTeacher.setQualification(teach.getQualification());
                        System.out.println("Teacher Record Updated Successfully");
                    }else{
                        System.out.println("Teacher Record Associated With ID: "+id+" Is Not Availabe.");
                    }
                    break;
                case 5:
                    System.out.println("Please Enter Teacher ID To Delete Student Record");
                    id = scan.nextInt();
                    if(id <= teacher.size() & id > 0) {
                        teacher.remove(id - 1);
                        System.out.println("Teacher Record Associated With ID : "+id+" Deleted successfully !");
                    }else{
                        System.out.println("Teacher Record Associated With ID: "+id+" Is Not Availabe.");
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
