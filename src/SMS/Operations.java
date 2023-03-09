package SMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Operations {

    Scanner sc = new Scanner(System.in);
    ArrayList<Student> l1 = new ArrayList<Student>();
    PrintResult printResult = new PrintResult();

    public void addStudent() {
        System.out.println("Enter Student Name::");
        String name = sc.next();
        System.out.println("Enter Roll Number::");
        int rollNo = sc.nextInt();
        boolean exist=false;
        for (Student i : l1) {
            if (i.rollNo == rollNo) {
                exist=true;
                try {
                    throw new DuplicateStudentException();
                } catch (DuplicateStudentException e) {
                    e.getMessage();
                }
            }}
        if(!exist){

                System.out.println("Enter Division::");
                int div = sc.nextInt();
                System.out.println("Enter age::");
                int age = sc.nextInt();
                System.out.println("Enter Address::");
                String address = sc.next();
                Student s1 = new Student(rollNo, name, div, age, address);
                l1.add(s1);
            }
        }



    public void displayStudents(){
        for (Student i:l1) {
            System.out.println(i);
        }
    }

    public void addStudentMarks() {

        System.out.println("Enter Roll no:");
        int rollNo1 = sc.nextInt();

        boolean present = false;

        for (Student i : l1) {

            if (i.rollNo == rollNo1) {
                System.out.println("Roll number found!");
                present = true;
            }
        }

        if (present == false) {
            try {
                throw new StudentNotExistException();
            } catch (StudentNotExistException e) {
                e.getMessage();
                return;
            }
        } else {
            System.out.println("Enter marks of Student::");
            for (int i = 0; i < 5; i++) {
                int marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                    try {
                        throw new MarksNotInRangeException();
                    } catch (MarksNotInRangeException e) {
                        e.getMessage();
                    }
                } else {

                    for (Student s : l1) {

                        if (s.rollNo == rollNo1)
                            s.marks[i] = marks;
                    }
                }
            }
            for (Student s : l1) {

                if (s.rollNo == rollNo1) {
                    for (int i = 0; i < 5; i++) {
                        if (s.marks[i] < 35) {
                            s.marks[i] = s.marks[i] + 5;
                            break;
                        }
                    }
                }
            }
        }
    }

    public void DisplayMarksheet(){
        System.out.println("Enter Roll no:");
        int rollNo = sc.nextInt();
        for(Student s:l1) {
            if(s.rollNo==rollNo) {
                printResult.print(s);
                break;
            }
        }
    }
}
