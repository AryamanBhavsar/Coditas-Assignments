package Assignment_23.Question_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class StudentOperation {

    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

    Connection con = Connectivity.Create();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public void Query1() throws SQLException {
        ps=con.prepareStatement("alter table student2 add column gender varchar(20)");

        try{
            ps.executeUpdate();
            System.out.println("Column added!");
        }catch (Exception e){
            System.out.println("Column already present");
        }
    }

   public void Query2(){
        try {
            st = con.createStatement();
            String query = "select * from student2 where year ='3' and percentage>70";
            rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println("        ID::"+rs.getInt(1));
                System.out.println("      NAME::"+rs.getString(2));
                System.out.println("      YEAR::"+rs.getString(3));
                System.out.println("PERCENTAGE::"+rs.getInt(4));
                System.out.println("      CITY::"+rs.getString(5));
                System.out.println("    GENDER::"+rs.getString(6));
                System.out.println("=====================");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void Query3() throws SQLException {
        ps=con.prepareStatement("select * from student2 where id between 1 and 10");
        rs=ps.executeQuery();
        while(rs.next()){
            System.out.println("        ID::"+rs.getInt(1));
            System.out.println("      NAME::"+rs.getString(2));
            System.out.println("      YEAR::"+rs.getString(3));
            System.out.println("PERCENTAGE::"+rs.getInt(4));
            System.out.println("      CITY::"+rs.getString(5));
            System.out.println("    GENDER::"+rs.getString(6));
            System.out.println("=====================");
        }
    }


    void case4() throws IOException {
        Boolean flag = true;
        StudentOperation manageDatabase = new StudentOperation();
        while(flag){
            System.out.println("0.EXIT");
            System.out.println("1.ADD RECORDS");
            System.out.println("2.UPDATE");
            System.out.println("3.REMOVE FINAL YEAR STUDENTS");
            int choice = Integer.parseInt(sc.readLine());

            switch (choice){

                case 1: manageDatabase.add();
                    break;
                case 2: manageDatabase.update();
                    break;
                case 3: manageDatabase.remove();
                    break;
                case 0: flag=false;
                    break;
                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }

    void add(){
        for(int i=1;i<=3;i++) {
            try {
                System.out.println("Enter ID:");
                int id = Integer.parseInt(sc.readLine());
                System.out.println("Enter Name:");
                String name = sc.readLine();
                System.out.println("Enter Year:");
                String year = sc.readLine();
                System.out.println("Enter Percentage:");
                int percentage = Integer.parseInt(sc.readLine());
                System.out.println("Enter City:");
                String city = sc.readLine();
                System.out.println("Enter Gender:");
                String gender = sc.readLine();
                PreparedStatement preparedStatement = con.prepareStatement("insert into student2 values(?,?,?,?,?,?)");
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, year);
                preparedStatement.setInt(4, percentage);
                preparedStatement.setString(5, city);
                preparedStatement.setString(6, gender);
                preparedStatement.execute();
            } catch (IOException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void update(){
        try {
            PreparedStatement preparedStatement = con.prepareStatement("UPDATE student2 SET name = CONCAT('Mr. ', name) WHERE GENDER = 'M'");
            preparedStatement.execute();
            PreparedStatement preparedStatement1 = con.prepareStatement("UPDATE student2 SET name = CONCAT('Ms. ', name) WHERE GENDER = 'F';");
            preparedStatement1.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    void remove(){
        try {
            PreparedStatement preparedStatement = con.prepareStatement("delete from student2 where year=4");
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
