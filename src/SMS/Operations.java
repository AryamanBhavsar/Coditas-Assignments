package SMS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Collections.sort(l1,new SortByRoll());
        for (Student i:l1) {
            System.out.println("------------------------------");
            System.out.println("Name:      |  " + i.name);
            System.out.println("Roll No:   |  " + i.rollNo);
            System.out.println("Division:  |  "+ i.div);
            System.out.println("Age     :  |  " + i.age);
            System.out.println("-------------------------------");
        }

    }

    public void addStudentMarks() {

        System.out.println("Enter Roll no:");
        int rollNo1 = sc.nextInt();

        boolean present = false;

        for (Student i : l1) {

            if (i.rollNo == rollNo1) {
                System.out.println("Roll number found!");
                System.out.println("Name:"+i.name);
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
            System.out.println("Enter marks of English,Hindi,Maths,Physics,Chemistry::");
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

class SortByRoll implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo-o2.rollNo;
    }
}
