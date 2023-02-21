package Assignment_12;

class Employee{
    int id = 0;
    String name = "Not Available";
    String address = "Write here";
    int salary = 00;

    public Employee(int id, String name, String address, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Q9 {
    public static void main(String[] args) {

        Employee employee = new Employee(101,"Aryaman","Indore",500000);
        System.out.println(employee);
    }
}
