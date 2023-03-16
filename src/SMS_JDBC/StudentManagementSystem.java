package SMS_JDBC;

import SMS.DuplicateStudentException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException, DuplicateStudentException, SMS_JDBC.DuplicateStudentException {

        Scanner sc = new Scanner(System.in);
      //  PrintResult printResult = new PrintResult();
       // Operations operations = new Operations();
        Operations operations = new Operations();

        boolean flag = true;

        while(flag){
            System.out.println("0.EXIT");
            System.out.println("1.ADD STUDENT");
            System.out.println("2.DISPLAY STUDENTS");
            System.out.println("3.ADD STUDENT MARKS");
            System.out.println("4.DISPLAY STUDENT RESULT");
            int choice = sc.nextInt();

            switch (choice){
                case 0:
                    System.out.println("Thank-You Visit Again!");
                    flag = false;
                    break;

                case 1:
                    operations.addStudent();
                    break;

                case 2:
                    operations.displayStudents();
                    break;

                case 3:
                    operations.addMarks();
                    break;

                case 4:
                    operations.displayStudentMarks();
                    break;

                default:
                    System.out.println("Enter Valid Choice!!");
                    break;
            }
        }
    }
}

