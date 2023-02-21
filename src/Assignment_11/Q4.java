package Assignment_11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

class Add {

    public void sum(int a,int b) {
        System.out.print("Sum is::");
        System.out.println(a+b);
    }
}

public class Q4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Add add = new Add();

        Class cls = add.getClass();
        System.out.println("Classes are::"+cls);

        Method method1 = cls.getMethod("sum",int.class,int.class);

        Integer result = (Integer) method1.invoke(add, 5, 4);

    }
}
//
//Output-
//        Classes are::class Assignment_11.Add
//        Sum is::9