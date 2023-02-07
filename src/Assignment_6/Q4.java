package Assignment_6;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        int x=1;

        System.out.println("Enter a value:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

         if(input == 0){
            x=x+2;
             System.out.println("X="+x);
         }

        else if(input == 1){
            x=x+4;
            System.out.println("X="+x);
        }

         else if(input == 2){
             x=x+6;
             System.out.println("X="+x);
         }

         else
             System.out.println("Invalid Entry");
    }
}
