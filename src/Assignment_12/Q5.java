package Assignment_12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Operations{
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five names::");

        String arr[] = new String[5];

        for(int i=0;i< arr.length;i++){
            arr[i]=sc.next();
        }

        Arrays.sort(arr, Comparator.comparing(s -> s.length()));

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]+" ");
        }
        String str = sb.toString();
        System.out.println("The Arranged Names are::");
        System.out.println(str);

        String newStr = str.replaceAll("a","b").replaceAll("A","B")
                .replaceAll("e","f").replaceAll("E","F")
                .replaceAll("i","j").replaceAll("I","J")
                .replaceAll("o","p").replaceAll("O","P")
                .replaceAll("u","v").replaceAll("U","V");

        System.out.println("With vowels are::");
        System.out.println(newStr);
    }
}

public class Q5 {
    public static void main(String[] args) {

        Operations operations = new Operations();
        operations.input();
    }
}
//
//Output-
//        Enter Five names::
//        Aryaman
//        Aditya
//        Raghav
//        Tushar
//        Mohit
//        The Arranged Names are::
//        Mohit Aditya Raghav Tushar Aryaman
//        With vowels are::
//        Mphjt Bdjtyb Rbghbv Tvshbr Brybmbn
