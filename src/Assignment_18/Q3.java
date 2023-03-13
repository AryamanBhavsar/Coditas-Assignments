package Assignment_18;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(40);
        queue.add(43);
        queue.add(21);
        queue.add(23);

        System.out.print("Original queue:");
        System.out.println(queue);

        queue.poll();

        System.out.print("Queue after Removal:");
        System.out.println(queue);

        System.out.print("Is queue empty?");
        System.out.println(queue.isEmpty());
    }
}
//
//output-
//        Original queue:[21, 23, 40, 43]
//        Queue after Removal:[23, 43, 40]
//        Is queue empty?false