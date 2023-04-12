package App;

import Controller.Operation;
import DAO.StudentSchool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws IOException {
        BufferedReader  sc = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;

        while (flag){
            System.out.println("0.EXIT");
            System.out.println("1.Create");
            System.out.println("2.Retrieve");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            int choice = Integer.parseInt(sc.readLine());

            switch (choice){
                case 0:
                    flag = false;
                    break;

                case 1:
                    StudentSchool student = new StudentSchool();
                    System.out.println("Enter Name of Student:");
                    student.setName(sc.readLine());
                    System.out.println("Enter Age:");
                    student.setAge(Integer.parseInt(sc.readLine()));
                    System.out.println("Enter Standard:");
                    student.setStandard(Integer.parseInt(sc.readLine()));

                    Operation.createUser(student);

                    break;

                case 2:
                    Operation.SelectUser();
                    break;

                case 3:
                    Operation.UpdateUser();
                    break;


                case 4:
                    Operation.DeleteUser();
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
