package Assignment_18;//Java Hashtable class implements a hashtable, which maps keys to values.
//It inherits Dictionary class and implements the Map interface. It is legacy is of now, HashMap is used instead
//of this.


import java.util.Hashtable;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> Ht = new Hashtable<Integer,String>();

        Ht.put(01,"Aryaman");
        Ht.put(02,"Ram");
        Ht.put(03,"Raghav");
        Ht.put(04,"Peter");

        for(Map.Entry m:Ht.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
