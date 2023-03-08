package CAS;

import java.util.Scanner;

public class CheckCapacity {

    Scanner sc = new Scanner(System.in);

    static int tableFor2=8, tableFor4= 4, tableFor6= 2, tableFor8=2;

    boolean IsReserved = false;

    public void check(int capacity){

        if(capacity<=2){
            if (tableFor2 != 0) {
                tableFor2 -= 1;
                IsReserved = true;
                System.out.println("Booking Done! Max occupancy::"+2);
            }
        }

        if(capacity<=4 && !IsReserved){
            if(tableFor4 !=0){
                tableFor4 -= 1;
                IsReserved = true;
                System.out.println("Booking Done! Max occupancy::"+4);
            }
        }

        if(capacity<=6 && !IsReserved){
            if(tableFor6 !=0){
                tableFor6 -= 1;
                IsReserved = true;
                System.out.println("Booking Done! Max occupancy::"+6);
            }
        }

        if(capacity<=8 && !IsReserved){
            if(tableFor8 !=0){
                tableFor8 -= 1;
                IsReserved = true;
                System.out.println("Your seat is booked having max occupancy::"+8);
            }
        }

        if(!IsReserved){
            System.out.println("No Seats in the cafe available at the moment!");
        }

        System.out.println("Seats of 2 left::"+tableFor2);
        System.out.println("Seats of 4 left::"+tableFor4);
        System.out.println("Seats of 6 left::"+tableFor6);
        System.out.println("Seats of 8 left::"+tableFor8);
        System.out.println();
    }
}
