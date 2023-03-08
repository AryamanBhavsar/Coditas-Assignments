package Assignment_17;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        set.add(10);
        set.add(20);
        set.add(18);
        set.add(2);

        System.out.print("HashSet is::");
        for (Integer i:set) {
            System.out.print(i+",");
        }
        System.out.println();

        TreeSet<Integer> Tset = new TreeSet<>(set);

        System.out.print("TreeSet is::");
        for (Integer i:Tset) {
            System.out.print(i+",");
        }
        System.out.println();
    }
}
//
//Output-
//        HashSet is::18,2,20,10,
//        TreeSet is::2,10,18,20,