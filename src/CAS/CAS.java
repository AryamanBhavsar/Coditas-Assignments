package CAS;

import java.util.Scanner;

public class CAS {
    public static void main(String[] args) {
        CheckCapacity checkCapacity = new CheckCapacity();
        PrintMenu printMenu = new PrintMenu();
        PlaceOrder placeOrder = new PlaceOrder();
        Scanner sc = new Scanner(System.in);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("   ARYAMAN'S CAFE   ");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^");

        boolean flag = true;

        while (flag) {
            System.out.println("0.EXIT");
            System.out.println("1.BOOK TABLE");
            System.out.println("2.PRINT MENU");
            System.out.println("3.PLACE ORDER");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    flag = false;
                    System.out.println("Thank-You Visit Again!!");
                    break;

                case 1:
                    System.out.println("Enter Seats:");
                    int reqCapacity = sc.nextInt();
                    checkCapacity.check(reqCapacity);
                    break;


                case 2:
                    if(checkCapacity.IsReserved){
                        printMenu.print();
                    }
                    else
                        try {
                            throw new NoReservationFoundException();
                        } catch (NoReservationFoundException e) {
                            e.getMessage();
                        }
                    break;


                case 3:
                    if(checkCapacity.IsReserved){
                        placeOrder.order();
                    }
                    else{
                        try {
                            throw new NoReservationFoundException();
                        } catch (NoReservationFoundException e) {
                            e.getMessage();
                        }
                    }
                    break;


                default:
                    System.out.println("Enter valid choice!!!!");
                    break;
            }
        }
    }
}

//Output-
//        ^^^^^^^^^^^^^^^^^^^^^
//        ARYAMAN'S CAFE
//        ^^^^^^^^^^^^^^^^^^^^^
//        0.EXIT
//        1.BOOK TABLE
//        2.PRINT MENU
//        3.PLACE ORDER
//        2
//        No Reservation found!
//        0.EXIT
//        1.BOOK TABLE
//        2.PRINT MENU
//        3.PLACE ORDER
//        3
//        No Reservation found!
//        Enter valid choice!!!!
//        0.EXIT
//        1.BOOK TABLE
//        2.PRINT MENU
//        3.PLACE ORDER
//        1
//        Enter Seats:
//        12
//        Available!
//        Seat Reserved
//        0.EXIT
//        1.BOOK TABLE
//        2.PRINT MENU
//        3.PLACE ORDER
//        2
//        ---------------------------
//        |    Name      |  Price   |
//        ---------------------------
//        | 1.Tea        |  Rs.10   |
//        | 2.Coffee     |  Rs.30   |
//        | 3.Pizza      |  Rs.100  |
//        | 4.Burger     |  Rs.70   |
//        | 5.Shakes     |  Rs.120  |
//        | 6.Maggie     |  Rs.50   |
//        | 7.Pav-Bhaji  |  Rs.80   |
//        ---------------------------
//        0.EXIT
//        1.BOOK TABLE
//        2.PRINT MENU
//        3.PLACE ORDER
//        3
//        ---------------------------
//        |    Name      |  Price   |
//        ---------------------------
//        | 1.Tea        |  Rs.10   |
//        | 2.Coffee     |  Rs.30   |
//        | 3.Pizza      |  Rs.100  |
//        | 4.Burger     |  Rs.70   |
//        | 5.Shakes     |  Rs.120  |
//        | 6.Maggie     |  Rs.50   |
//        | 7.Pav-Bhaji  |  Rs.80   |
//        ---------------------------
//        Enter 0 to stop ordering!
//        Enter Dish Number:
//        4
//        Enter Quantity:
//        1
//        ---------------------------
//        |    Name      |  Price   |
//        ---------------------------
//        | 1.Tea        |  Rs.10   |
//        | 2.Coffee     |  Rs.30   |
//        | 3.Pizza      |  Rs.100  |
//        | 4.Burger     |  Rs.70   |
//        | 5.Shakes     |  Rs.120  |
//        | 6.Maggie     |  Rs.50   |
//        | 7.Pav-Bhaji  |  Rs.80   |
//        ---------------------------
//        Enter 0 to stop ordering!
//        Enter Dish Number:
//        2
//        Enter Quantity:
//        2
//        ---------------------------
//        |    Name      |  Price   |
//        ---------------------------
//        | 1.Tea        |  Rs.10   |
//        | 2.Coffee     |  Rs.30   |
//        | 3.Pizza      |  Rs.100  |
//        | 4.Burger     |  Rs.70   |
//        | 5.Shakes     |  Rs.120  |
//        | 6.Maggie     |  Rs.50   |
//        | 7.Pav-Bhaji  |  Rs.80   |
//        ---------------------------
//        Enter 0 to stop ordering!
//        Enter Dish Number:
//        0
//        ************************
//        BILL NUMBER #6550
//        -------------------------
//        Name       Quantity
//        -------------------------
//        Burger            1
//        Coffee            2
//        TOTAL BILL: Rs.130
//        -------------------------
//        0.EXIT
//        1.BOOK TABLE
//        2.PRINT MENU
//        3.PLACE ORDER
//        0
//        Thank-You Visit Again!!
