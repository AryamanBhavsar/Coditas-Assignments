package CAS;

import java.util.Scanner;

public class CheckCapacity {

    Scanner sc = new Scanner(System.in);

    int totCapacity = 20;
    int tabNo=1;
    boolean IsReserved = false;

    public void check(int capacity){
        if(capacity<= totCapacity){
            System.out.println("Available!");
            IsReserved=true;
            totCapacity = totCapacity-capacity;
            tabNo++;
            System.out.println("Seat Reserved");
        }

        else{
            System.out.println("Capacity Exceeded!!");
            System.out.println("Only "+totCapacity+" seats left!");
        }
    }
}
