package Assignment_6;

import java.util.Scanner;

public class Q7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter today's date");
        int input = sc.nextInt();

        for(int i=1;i<=input;i++){
            System.out.println(i);
        }
    }
}
