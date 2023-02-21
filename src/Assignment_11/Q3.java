package Assignment_11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

class Student1 {
    private String name;
    private String midName;
    private int id;

    public void display(){
        System.out.println("Method of class");
        System.out.println(name);
        System.out.println(midName);
    }
}

    public class Q3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Student1 student1 = new Student1();

        Class cls = student1.getClass();
        System.out.println("The name of class is::"+cls.getName());

        String method = Arrays.toString(cls.getDeclaredMethods());
        System.out.println("Declared methods are::"+method);

        String name = Arrays.toString(cls.getDeclaredFields());
        System.out.println("Declared fields are::"+name);

        Field field = cls.getDeclaredField("midName");
        Field field2 = cls.getDeclaredField("name");
        field.setAccessible(true);
        field2.setAccessible(true);
        field.set(student1,"Bhavsar");
        field2.set(student1,"Aryaman");

        Method methodcall2  = cls.getDeclaredMethod("display");

        methodcall2.invoke(student1);
    }
}
//
//Output-
//        The name of class is::Assignment_11.Student1
//        Declared methods are::[public void Assignment_11.Student1.display()]
//        Declared fields are::[private java.lang.String Assignment_11.Student1.name, private java.lang.String Assignment_11.Student1.midName, private int Assignment_11.Student1.id]
//        Method of class
//Aryaman
//Bhavsar