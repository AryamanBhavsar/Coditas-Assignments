//Q3.To calculate salary of manager

package Assignment_8;

class Manager extends Employee{
    int FixedSalary;
    int incentives;

    public int getFixedSalary() {
        return FixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        FixedSalary = fixedSalary;
    }

    public int getIncentives() {
        return incentives;
    }

    public void setIncentives(int incentives) {
        this.incentives = incentives;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "FixedSalary=" + FixedSalary +
                ", incentives=" + incentives +
                ", empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }

    public void computeSalary(){
        int salary = FixedSalary+incentives;
        System.out.print("Rs."+salary);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Rohan");
        manager.setEmpId(103);
        manager.setFixedSalary(50000);
        manager.setIncentives(25000);

        System.out.println(manager);
        System.out.print("Salary of Manager "+manager.getName()+" is ");
        manager.computeSalary();
    }
}

//Output-
//        Manager{FixedSalary=50000, incentives=25000, empId=103, name='Rohan'}
//        Salary of Manager Rohan is Rs.75000
