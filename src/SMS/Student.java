package SMS;

import java.util.ArrayList;

public class Student {

        int rollNo;
        String name;
        int div;
        int age;
        String address;
        int marks[] = new int[5];


        public Student(int rollNo, String name, int div, int age , String address) {
            this.rollNo = rollNo;
            this.name = name;
            this.div = div;
            this.age = age;
            this.address = address;
        }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", div=" + div +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}
