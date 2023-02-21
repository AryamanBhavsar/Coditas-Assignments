package Assignment_12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three names::");

        String arr[] = new String[3];

        for(int i=0;i< arr.length;i++){
            arr[i]=sc.next();
        }

        Arrays.sort(arr, Comparator.comparing(s -> s.length()));

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
}
}
