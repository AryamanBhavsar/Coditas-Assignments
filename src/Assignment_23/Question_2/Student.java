package Assignment_23.Question_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Student {
    public static void main(String[] args) throws IOException, SQLException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        StudentOperation op=new StudentOperation();
        while(flag)
        {
            System.out.println("0.EXIT");
            System.out.println("1.ALTER (ADD GENDER)");
            System.out.println("2.FETCH SOME STUDENT");
            System.out.println("3.FETCH STUDENT ID BETWEEN 1-10");
            System.out.println("4.MORE QUERIES....");
            int ch=Integer.parseInt(sc.readLine());
            switch(ch)
            {
                case 0:
                    flag=false;
                    break;
                case 1:
                    op.Query1();
                    break;
                case 2:
                    op.Query2();
                    break;
                case 3:
                    op.Query3();
                    break;
                case 4:
                    op.case4();
                    break;
                default:
                    System.out.println("INVALID INPUT!!!!");
            }
        }
    }
}

//Output_
//        0.EXIT
//        1.ALTER (ADD GENDER)
//        2.FETCH SOME STUDENT
//        3.FETCH STUDENT ID BETWEEN 1-10
//        4.MORE QUERIES....
//        2
//        0.EXIT
//        1.ALTER (ADD GENDER)
//        2.FETCH SOME STUDENT
//        3.FETCH STUDENT ID BETWEEN 1-10
//        4.MORE QUERIES....
//        3
//        ID::1
//        NAME::Aryaman
//        YEAR::4
//        PERCENTAGE::88
//        CITY::Indore
//        GENDER::null
//        =====================
//        ID::2
//        NAME::Mr. Parth
//        YEAR::3
//        PERCENTAGE::56
//        CITY::werg
//        GENDER::M
//        =====================
//        ID::3
//        NAME::Ms. sdfgh
//        YEAR::2
//        PERCENTAGE::76
//        CITY::ghd
//        GENDER::F
//        =====================
//        ID::4
//        NAME::Mr. sdfg
//        YEAR::4
//        PERCENTAGE::78
//        CITY::dfghgg
//        GENDER::M
//        =====================
//        ID::5
//        NAME::Aman
//        YEAR::3
//        PERCENTAGE::88
//        CITY::Indore
//        GENDER::M
//        =====================
//        0.EXIT
//        1.ALTER (ADD GENDER)
//        2.FETCH SOME STUDENT
//        3.FETCH STUDENT ID BETWEEN 1-10
//        4.MORE QUERIES....
//        4
//        0.EXIT
//        1.ADD RECORDS
//        2.UPDATE
//        3.REMOVE FINAL YEAR STUDENTS
//        2
//        0.EXIT
//        1.ADD RECORDS
//        2.UPDATE
//        3.REMOVE FINAL YEAR STUDENTS
//        3
//        0.EXIT
//        1.ADD RECORDS
//        2.UPDATE
//        3.REMOVE FINAL YEAR STUDENTS
//        0
//        0.EXIT
//        1.ALTER (ADD GENDER)
//        2.FETCH SOME STUDENT
//        3.FETCH STUDENT ID BETWEEN 1-10
//        4.MORE QUERIES....
//        0
//
//        Process finished with exit code 0
