package Assignment_6;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        System.out.println("Enter temperature value: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input){
            case 1:
                System.out.println("Low");
                break;

            case 2:
                System.out.println("Medium");
                break;

            case 3:
                System.out.println("High");
                break;

            case 4:
                System.out.println("Abnormal");
                break;

            default:
                System.out.println("Invalid entry");

        }


    }
}
