//Q2. Override  salesperson class in salespersonn

package Assignment_8;

class SalesPerson extends WageEmployee{
    String name;
    int empId;
    int sales;
    int commission;

    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getEmpId() {
        return empId;
    }

    @Override
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", sales=" + sales +
                ", commission=" + commission +
                '}';
    }

    public void computeSalary(){
        int salary = sales+commission;
        System.out.print("Rs."+salary);
    }

}

public class Q2 {
    public static void main(String[] args) {
    SalesPerson salesPerson = new SalesPerson();
    salesPerson.setEmpId(102);
    salesPerson.setName("Ayush");
    salesPerson.setSales(25000);
    salesPerson.setCommission(5000);

        System.out.println(salesPerson);

        System.out.print("Salary of "+salesPerson.getName()+" is ");
        salesPerson.computeSalary();

    }
}
//
//Output-
//        SalesPerson{name='Ayush', empId=102, sales=25000, commission=5000}
//        Salary of Ayush is Rs.30000