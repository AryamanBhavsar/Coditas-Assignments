package Assignment_18;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Q6 {
    public static void main(String[] args) {
        NavigableMap<String, Integer> nm = new TreeMap<>();


        nm.put("C", 888);
        nm.put("Y", 999);
        nm.put("A", 444);
        nm.put("T", 555);
        nm.put("B", 666);
        nm.put("A", 555);


        System.out.println("Mappings of NavigableMap : " + nm);

        System.out.println("Descending Set  :" +nm.descendingKeySet());
        System.out.println("Floor Entry  :" +nm.floorEntry("L"));
        System.out.println("First Entry  : "+ nm.firstEntry());
        System.out.println("Last Key : "+ nm.lastKey());
        System.out.println("First Key :"+ nm.firstKey());
        System.out.println("Original Map : "+ nm);
        System.out.println("Reverse Map : "+ nm.descendingMap());


        Iterator<NavigableMap.Entry<String,Integer> > itr = nm.entrySet().iterator();

        System.out.println("Traversing using Iterator: ");

        while (((Iterator<?>) itr).hasNext()) {
            NavigableMap.Entry<String,Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
