package Assignment_13;

import java.util.Scanner;

class CastException{
    public void Operate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to divide::");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result = 0;

        try {
            result = n1/n2;
            System.out.println("Division is::"+result);
        } catch (Exception e) {
            System.out.println("Divisor is zero!!!");
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        CastException castException = new CastException();
        castException.Operate();
    }
}
