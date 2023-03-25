package Assignment_23.Question_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class EmployeeOperations {
    Connection con = Connectivity.Create();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    public void insert() throws IOException, SQLException {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter ID:");
            int empid = Integer.parseInt(sc.readLine());
            st = con.createStatement();
            rs = st.executeQuery("select * from employee where id=" + empid);

            if (rs.next()) {
                System.out.println("ID Already Exist!!");
            } else {
                flag = false;
                System.out.println("Enter Name:");
                String empname = sc.readLine();
                System.out.println("Enter Designation:");
                String designation = sc.readLine();
                System.out.println("Enter Date-Of-Joining:");
                String doj = sc.readLine();
                System.out.println("Enter Experience:");
                int exp = Integer.parseInt(sc.readLine());
                System.out.println("Enter Salary:");
                int salary = Integer.parseInt(sc.readLine());
                System.out.println("Enter Status(Working/Left):");
                String status = sc.readLine();
                ps = con.prepareStatement("insert into employee(id,name,designation,DOJ,experience,salary,status)values(?,?,?,?,?,?,?)");
                ps.setInt(1, empid);
                ps.setString(2, empname);
                ps.setString(3, designation);
                ps.setString(4, doj);
                ps.setInt(5, exp);
                ps.setInt(6, salary);
                ps.setString(7, status);
                ps.execute();
                System.out.println();
                System.out.println("EMPLOYEE ADDED SUCESSFULLY!");
            }
        }
    }

    public void display() throws SQLException {
        st = con.createStatement();
        rs = st.executeQuery("select * from employee");
        while (rs.next()) {
            System.out.println("==================================");
            System.out.println("          EMPID::" + rs.getInt(1));
            System.out.println("        EMPNAME::" + rs.getString(2));
            System.out.println("    DESIGNATION::" + rs.getString(3));
            System.out.println("DATE OF JOINING::" + rs.getString(4));
            System.out.println("     EXPERIENCE::" + rs.getInt(5));
            System.out.println("         SALARY::" + rs.getInt(6));
            System.out.println("         STATUS::" + rs.getString(7));
            System.out.println("           CITY::"+rs.getString(8));
            System.out.println("==================================");
        }
    }

    public void alter() throws SQLException {

        ps=con.prepareStatement("alter table employee add column city varchar(20) DEFAULT 'PUNE' ");
        try {
            ps.executeUpdate();
            System.out.println();
            System.out.println("Column Added!!");
        }catch (Exception e){
            System.out.println("Column Already Present!");
        }


    }

    public void fetch() throws SQLException {
        ps=con.prepareStatement("select * from employee where city='PUNE' and salary>20000");
        rs=ps.executeQuery();
        while(rs.next())
        {
            System.out.println("==================================");
            System.out.println("          EMPID::" + rs.getInt(1));
            System.out.println("        EMPNAME::" + rs.getString(2));
            System.out.println("    DESIGNATION::" + rs.getString(3));
            System.out.println("DATE OF JOINING::" + rs.getString(4));
            System.out.println("     EXPERIENCE::" + rs.getInt(5));
            System.out.println("         SALARY::" + rs.getInt(6));
            System.out.println("         STATUS::" + rs.getString(7));
            System.out.println("           CITY::"+rs.getString(8));
            System.out.println("==================================");
        }
        System.out.println();
    }

    public void salaryupdate() throws SQLException {
        ps=con.prepareStatement("update employee set salary=salary+1000;");
        ps.executeUpdate();
        System.out.println("SALARY UPDATED!!");
    }

    public void delete() throws IOException, SQLException {

        boolean flag = true;
        while (flag) {
            System.out.println("Enter ID:");
            int id = Integer.parseInt(sc.readLine());
            st = con.createStatement();
            rs = st.executeQuery("select * from employee where id=" + id);

            if (rs.next()) {
                flag=false;
                ps = con.prepareStatement("delete from employee where id=?");
                ps.setInt(1, id);
                ps.execute();
                System.out.println();
                System.out.println("EMPLOYEE DELETED SUCESSFULLY!!");
            } else {
                System.out.println("No Such ID found!!");
            }
        }
    }
}
