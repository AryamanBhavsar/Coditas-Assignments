//Question-1
//To calculate the wage of an employee using inheritance


package Assignment_8;

class  Employee{
    int empId;
    String name;
    int hours;
    int rate;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", rate=" + rate +
                '}';
    }
}

class WageEmployee extends Employee{
    public void computeSalary(){
        int Salary = hours*rate;
        System.out.print("Rs."+Salary);
    }
}

public class Q1 {
    public static void main(String[] args) {

        WageEmployee wageEmployee = new WageEmployee();
        wageEmployee.setEmpId(101);
        wageEmployee.setName("Aryaman");
        wageEmployee.setHours(40);
        wageEmployee.setRate(280);

        System.out.println(wageEmployee);
        System.out.println("Salary of "+wageEmployee.getName()+" for "+wageEmployee.getHours()+" hours at Rs."+wageEmployee.getRate()+" per hour is ");
        wageEmployee.computeSalary();

    }
}
//Output-
//        Employee{empId=101, name='Aryaman', hours=40, rate=280}
//        Salary of Aryaman for 40 hours at Rs.280 per hour is
//        Rs.11200