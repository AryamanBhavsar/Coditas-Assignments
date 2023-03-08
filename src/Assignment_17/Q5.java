package Assignment_17;

import java.util.HashSet;
import java.util.Set;

public class Q5 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(10);
        set.add(20);
        set.add(18);
        set.add(2);

        System.out.println("HashSet::");
        for (Integer i:set) {
            System.out.print(i+",");
        }
        System.out.println();

        int[] array = set.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("Array::");
        for (int i:array) {
            System.out.print(i+",");
        }

    }
}
