package Assignment_18;

import java.util.Enumeration;
import java.util.Vector;

public class Q4 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(30);
        v.add(10);
        v.add(7);
        v.add(100);
        v.add(345);


        System.out.println("Enumeration");
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.print(e.nextElement()+",");
        }

        v.addElement(40);
        System.out.println();
        System.out.println("First element: "+v.firstElement());

        System.out.println(v);

        System.out.println("Last element: "+v.lastElement());
    }
}
//
//output-
//        Enumeration
//        30,10,7,100,345,
//        First element: 30
//        [30, 10, 7, 100, 345, 40]
//        Last element: 40
