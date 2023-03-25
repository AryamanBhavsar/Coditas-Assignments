package Assignment_23.Question_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Employee {
    public static void main(String[] args) throws IOException, SQLException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        EmployeeOperations employeeOperations = new EmployeeOperations();
        boolean flag = true;

        while(flag){
            System.out.println("0.EXIT");
            System.out.println("1.INSERT");
            System.out.println("2.SHOW ALL");
            System.out.println("3.ALTER TABLE");
            System.out.println("4.FETCH EMPLOYEES OF PUNE");
            System.out.println("5.UPDATE SALARY");
            System.out.println("6.DELETE");
            int choice = Integer.parseInt(bf.readLine());

            switch (choice){
                case 0:
                    flag = false;
                    break;

                case 1:
                    employeeOperations.insert();
                    break;

                case 2:
                    employeeOperations.display();
                    break;

                case 3:
                    employeeOperations.alter();
                    break;

                case 4:
                    employeeOperations.fetch();
                    break;

                case 5:
                    employeeOperations.salaryupdate();
                    break;

                case 6:
                    employeeOperations.delete();
                    break;

                default:
                    System.out.println("Invalid Input!!");
            }
        }
    }
}

//Output-
//
//
//        0.EXIT
//        1.INSERT
//        2.SHOW ALL
//        3.ALTER TABLE
//        4.FETCH EMPLOYEES OF PUNE
//        5.UPDATE SALARY
//        6.DELETE
//        1
//        Enter ID:
//        3
//        ID Already Exist!!
//        Enter ID:
//        2
//        Enter Name:
//        Anuj
//        Enter Designation:
//        Engineer
//        Enter Date-Of-Joining:
//        02-04-2023
//        Enter Experience:
//        4
//        Enter Salary:
//        80000
//        Enter Status(Working/Left):
//        Working
//
//        EMPLOYEE ADDED SUCESSFULLY!
//        0.EXIT
//        1.INSERT
//        2.SHOW ALL
//        3.ALTER TABLE
//        4.FETCH EMPLOYEES OF PUNE
//        5.UPDATE SALARY
//        6.DELETE
//        2
//        ==================================
//        EMPID::1
//        EMPNAME::Aryaman
//        DESIGNATION::Developer
//        DATE OF JOINING::01-02-2023
//        EXPERIENCE::2
//        SALARY::51000
//        STATUS::Working
//        CITY::PUNE
//        ==================================
//        ==================================
//        EMPID::2
//        EMPNAME::Anuj
//        DESIGNATION::Engineer
//        DATE OF JOINING::02-04-2023
//        EXPERIENCE::4
//        SALARY::80000
//        STATUS::Working
//        CITY::PUNE
//        ==================================
//        ==================================
//        EMPID::3
//        EMPNAME::Ram
//        DESIGNATION::Worker
//        DATE OF JOINING::3-4-23
//        EXPERIENCE::2
//        SALARY::11000
//        STATUS::Working
//        CITY::PUNE
//        ==================================
//        0.EXIT
//        1.INSERT
//        2.SHOW ALL
//        3.ALTER TABLE
//        4.FETCH EMPLOYEES OF PUNE
//        5.UPDATE SALARY
//        6.DELETE
//        3
//        Column Already Present!
//        0.EXIT
//        1.INSERT
//        2.SHOW ALL
//        3.ALTER TABLE
//        4.FETCH EMPLOYEES OF PUNE
//        5.UPDATE SALARY
//        6.DELETE
//        4
//        ==================================
//        EMPID::1
//        EMPNAME::Aryaman
//        DESIGNATION::Developer
//        DATE OF JOINING::01-02-2023
//        EXPERIENCE::2
//        SALARY::51000
//        STATUS::Working
//        CITY::PUNE
//        ==================================
//        ==================================
//        EMPID::2
//        EMPNAME::Anuj
//        DESIGNATION::Engineer
//        DATE OF JOINING::02-04-2023
//        EXPERIENCE::4
//        SALARY::80000
//        STATUS::Working
//        CITY::PUNE
//        ==================================
//
//        0.EXIT
//        1.INSERT
//        2.SHOW ALL
//        3.ALTER TABLE
//        4.FETCH EMPLOYEES OF PUNE
//        5.UPDATE SALARY
//        6.DELETE
//        5
//        SALARY UPDATED!!
//        0.EXIT
//        1.INSERT
//        2.SHOW ALL
//        3.ALTER TABLE
//        4.FETCH EMPLOYEES OF PUNE
//        5.UPDATE SALARY
//        6.DELETE
//        6
//        Enter ID:
//        5
//        No Such ID found!!
//        Enter ID:
//        2
//
//        EMPLOYEE DELETED SUCESSFULLY!!
//        0.EXIT
//        1.INSERT
//        2.SHOW ALL
//        3.ALTER TABLE
//        4.FETCH EMPLOYEES OF PUNE
//        5.UPDATE SALARY
//        6.DELETE
