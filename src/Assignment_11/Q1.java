package Assignment_11;

//Constructor Chaining
//Constructor Chaining is the process of calling the constructor with different parameters this the this() keyword or
//using the super() keyword.

class Student{
    private String name;
    private String midName;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, String midName, int id) {
        this.name = name;
        this.midName = midName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student student = new Student("Aryaman",101);
        Student student1 = new Student("Ram","Singh",210);

        System.out.println(student);
        System.out.println(student1);
    }

}
//
//Output-
//        Student{name='Aryaman', midName='null', id=101}
//        Student{name='Ram', midName='Singh', id=210}

