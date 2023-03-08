package Assignment_17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();
        int first = 0;
        Integer last=0;

        set.add(12);
        set.add(20);
        set.add(30);
        set.add(23);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        if(!set.isEmpty()){
            first = set.iterator().next();
        }

        Iterator<Integer> iterator1 = set.iterator();
        while(iterator1.hasNext()){
            last = (Integer) iterator1.next();
        }

        System.out.println("First element is::"+first);
        System.out.println("Last element is::"+last);
    }
}
//
//Output-
//        20
//        23
//        12
//        30
//        First element is::20
//        Last element is::30