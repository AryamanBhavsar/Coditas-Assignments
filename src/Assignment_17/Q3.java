package Assignment_17;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
        Object TreeSet;
        TreeSet<Integer> Tset = new TreeSet<Integer>();

        Tset.add(2);
        Tset.add(5);
        Tset.add(6);
        Tset.add(12);

        System.out.print("TreeSet is::");
        for (Integer i:Tset) {
            System.out.print(i+",");
        }
        System.out.println();

        Set<Integer> set = new HashSet<>(Tset);

        System.out.print("HashSet is::");
        for (Integer i:set) {
            System.out.print(i+",");
        }
    }
}
//
//Output-
//        TreeSet is::2,5,6,12,
//        HashSet is::2,5,6,12,