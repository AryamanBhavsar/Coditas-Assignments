package Assignment_8;


class Testemp extends Manager{

}
public class Q4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        WageEmployee we1 = new WageEmployee();
        SalesPerson sp = new SalesPerson();
        Manager m = new Manager();


        e1.setName("Aryaman");
        e1.setEmpId(101);


        we1.setName("Rahul");
        we1.setEmpId(102);
        we1.setHours(78);
        we1.setRate(300);

        sp.setName("Jatin");
        sp.setEmpId(103);
        sp.setSales(40000);
        sp.setCommission(3000);

        m.setName("Ram");
        m.setEmpId(104);
        m.setFixedSalary(30000);
        m.setIncentives(3000);

        Employee[] array = new Employee[4];

        array[0]=e1;
        array[1]=we1;
        array[2]=sp;
        array[3]=m;

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }


    }
}

//Output-
//        Employee{empId=101, name='Aryaman', hours=0, rate=0}
//        Employee{empId=102, name='Rahul', hours=78, rate=300}
//        SalesPerson{name='Jatin', empId=103, sales=40000, commission=3000}
//        Manager{FixedSalary=30000, incentives=3000, empId=104, name='Ram'}
