package Assignment_6;

import java.util.Scanner;

public class Q7_2 {
    public static void main(String[] args) {

        String dayOfWeeks[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        for(int i=0;i<dayOfWeeks.length;i++){
            if(dayOfWeeks[i]=="Tuesday"){
                continue;
            }
            else
            System.out.println(dayOfWeeks[i]);
        }
    }
}
