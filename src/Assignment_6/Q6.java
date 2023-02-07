package Assignment_6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Age of first person:");
        int input1 = sc.nextInt();
        System.out.println("Age of second person:");
        int input2 = sc.nextInt();
        System.out.println("Age of third person:");
        int input3 = sc.nextInt();

        if(input1>input2 && input1>input3){
            System.out.println("First person is the oldest");
        }

        else if(input2>input1 && input2>input3){
            System.out.println("Second person is the oldest");
        }

        else
            System.out.println("Third person is the oldest");



        if(input1<input2 && input1<input3){
            System.out.println("First person is the Youngest");
        }

        else if(input2<input1 && input2<input3){
            System.out.println("Second person is the youngest");
        }

        else
            System.out.println("Third person is the youngest");

    }
}
