package Assignment_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public float getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee o) {
        return Integer.compare((int) this.salary, (int) o.salary);
    }
}



class SortByName implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Q5 {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee(01,"Aryaman",500000));
        list.add(new Employee(04,"Rohan",3000));
        list.add(new Employee(02,"Ayush",20000));
        list.add(new Employee(03,"Vikas",3000000));

        System.out.println("*****SORTED BY NAME*****");
        Collections.sort(list,new SortByName());
        for (Employee e:list) {
            System.out.println(e);
        }
        System.out.println();


        List<Employee> highPaidEmployees = list.stream().filter(e -> e.getSalary() > 15000).sorted().collect(Collectors.toList());

        System.out.println("****EMPLOYEE WITH SALARY>15000****");
        for (Employee e:highPaidEmployees) {
            System.out.println(e);
        }
        System.out.println();
    }
}
