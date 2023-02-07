package Assignment_6;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        System.out.println("Enter two value:");
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        if(input1>input2)
            System.out.println("First number is greater");

        else
            System.out.println("Second number is greater");

    }
}
