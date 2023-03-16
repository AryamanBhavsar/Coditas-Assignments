package SMS_JDBC;

import SMS.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Operations {

    int marks[] = new int[5];
    Connection con;
    Statement st;
    PreparedStatement ps;
    PreparedStatement ps1;
    ResultSet rs,rs1;

    BufferedReader sc =  new BufferedReader(new InputStreamReader(System.in));

    public void addStudent() throws IOException, ClassNotFoundException, SQLException {


        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","12345678");

        st = con.createStatement();

        System.out.println("Enter Student Name::");
        String name = sc.readLine();
        System.out.println("Enter Roll Number::");
        int rollNo = Integer.parseInt(sc.readLine());

        ps = con.prepareStatement("select * from student where id=?");
        ps.setInt(1,rollNo);

        rs= ps.executeQuery();

        if(rs.next()){
            try {
                throw new SMS_JDBC.DuplicateStudentException();
            } catch (DuplicateStudentException e) {
                e.getMessage();
            }
        }

        else {
            System.out.println("Enter Division::");
            String div = sc.readLine();
            System.out.println("Enter age::");
            int age = Integer.parseInt(sc.readLine());
            System.out.println("Enter Address::");
            String address = sc.readLine();

            ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
            ps.setInt(1,rollNo);
            ps.setString(2,name);
            ps.setString(3,div);
            ps.setInt(4,age);
            ps.setString(5,address);
            ps.executeUpdate();


        }
    }

    public void displayStudents() throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","12345678");

        System.out.println("Enter Roll Number:");
        int rollNo = Integer.parseInt(sc.readLine());

        ps = con.prepareStatement("select * from student where id=?");
        ps.setInt(1,rollNo);

        rs = ps.executeQuery();

        if(rs.next()){
            System.out.println("----------------------------");
            System.out.println("NAME:     |   "+rs.getString(2));
            System.out.println("DIVISION: |   "+rs.getString(3));
            System.out.println("ADDRESS:  |   "+rs.getString(5));
            System.out.println("-----------------------------");
        }

        else {
            try {
                throw new StudentNotExistException();
            } catch (StudentNotExistException e) {
                e.getMessage();
            }
        }
    }

    public void displayStudentMarks() throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","12345678");

        System.out.println("Enter Roll Number:");
        int rollNo = Integer.parseInt(sc.readLine());

        ps = con.prepareStatement("Select student.name, marks.maths,marks.physics,marks.chemistry,marks.english,marks.hindi from student INNER JOIN marks ON student.id=marks.id where student.id=?");
        ps.setInt(1,rollNo);

        rs = ps.executeQuery();

        if(rs.next()){
            System.out.println("------------------------");
            System.out.println("|  SUBJECT    |  MARKS  |");
            System.out.println("------------------------");
            System.out.println("|   ENGLISH   |   "+rs.getInt(5)+"   |");
            System.out.println("|    HINDI    |   "+rs.getInt(6)+"   |");
            System.out.println("|    MATHS    |   "+rs.getInt(2)+"   |");
            System.out.println("|   PHYSICS   |   "+rs.getInt(3)+"   |");
            System.out.println("|  CHEMISTRY  |   "+rs.getInt(4)+"   |");
            System.out.println("------------------------");
            System.out.println("|  NAME  ---->  "+rs.getString(1));

            boolean result=true;
            for(int i=0;i<4;i++){
                if(rs.getInt(2)<35 || rs.getInt(3)<35 || rs.getInt(4)<35 ||
                        rs.getInt(5)<35 || rs.getInt(6)<35){
                    result=false;
                    break;
                }
            }

            if(result) {
                System.out.println("|  RESULT    |  PASS  |");
                System.out.println("------------------------");
            }
            else {
                System.out.println("|  RESULT    |  FAIL!  |");
                System.out.println("------------------------");
            }

        }

        else {
            try {
                throw new StudentNotExistException();
            } catch (StudentNotExistException e) {
                e.getMessage();
            }
        }

    }

    public void addMarks() throws IOException, ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eltp_jan_23","root","12345678");

        System.out.println("Enter Roll Number:");
        int rollNo = Integer.parseInt(sc.readLine());

        ps = con.prepareStatement("Select * from student where id=?");
        ps.setInt(1,rollNo);

        rs = ps.executeQuery();

        if(rs.next()) {
            ps = con.prepareStatement("Select * from marks where id=?");
            ps.setInt(1,rollNo);

            rs = ps.executeQuery();

            if(rs.next()){
                System.out.println("Marks of student already exist!!");
            }

            else {
                String sub[] = {"English", "Hindi", "Maths", "Physics", "Chemistry"};


                for (int i = 0; i < 5; i++) {
                    System.out.println("Enter marks of " + sub[i] + " :");
                    int enteredMark = Integer.parseInt(sc.readLine());
                    if (enteredMark > 0 && enteredMark < 100) {
                        marks[i] = enteredMark;
                    } else {
                        System.out.println("Marks not in range!");
                        i--;
                    }
                }

                for (int i = 0; i < 5; i++) {
                    if (marks[i] < 35) {
                        marks[i] = marks[i] + 5;
                        break;
                    }
                }

                ps = con.prepareStatement("insert into marks values(?,?,?,?,?,?)");
                ps.setInt(1, rollNo);
                ps.setInt(2, marks[2]);
                ps.setInt(3, marks[3]);
                ps.setInt(4, marks[4]);
                ps.setInt(5, marks[0]);
                ps.setInt(6, marks[1]);
                ps.executeUpdate();
            }


        }

        else {
            try {
                throw new StudentNotExistException();
            } catch (StudentNotExistException e) {
                e.getMessage();
            }
        }
    }
}
