package CAS;

import java.util.HashMap;

public class PrintMenu {
    public void print(){

        System.out.println("---------------------------");
        System.out.println("|    Name      |  Price   |");
        System.out.println("---------------------------");
        System.out.println("| 1.Tea        |  Rs.10   |");
        System.out.println("| 2.Coffee     |  Rs.30   |");
        System.out.println("| 3.Pizza      |  Rs.100  |");
        System.out.println("| 4.Burger     |  Rs.70   |");
        System.out.println("| 5.Shakes     |  Rs.120  |");
        System.out.println("| 6.Maggie     |  Rs.50   |");
        System.out.println("| 7.Pav-Bhaji  |  Rs.80   |");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        PrintMenu printMenu = new PrintMenu();
        printMenu.print();
    }
}
