package Assignment_17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q1 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();

        set.add(10);
        set.add(20);
        set.add(18);
        set.add(2);

        for (Integer i:set) {
            System.out.println(i);
        }

        System.out.println(set.contains(18));
    }
}

//Output-
//        18
//        2
//        20
//        10
//        true
