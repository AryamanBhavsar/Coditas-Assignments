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
        List<StudentSchool> l;

        while (flag){
            System.out.println("0.EXIT");
            System.out.println("1.Create");
            System.out.println("2.Retrieve");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Fetch by Restrictions");
            System.out.println("6.Fetch by Order");
            System.out.println("7.Fetch by Projection");
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

                case 5:
                    System.out.println("Enter age so that criteria to be applied");
                    int age = Integer.parseInt(sc.readLine());
                    l = Operation.fetchByRestriction(age);

                    for(StudentSchool s:l){
                        System.out.println(s);
                    }
                    break;

                case 6:
                    System.out.println("Which column? (age,standard)");
                    String column = sc.readLine();
                    System.out.println("Asc or Desc?");
                    String order = sc.readLine();

                    l = Operation.fetchByOrder(order,column);

                    for(StudentSchool s:l){
                        System.out.println(s);
                    }


                    break;

                case 7:
                   Operation.singleprojection();
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
