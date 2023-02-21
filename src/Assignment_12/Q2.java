package Assignment_12;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();

        int vowel=0,consonant=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' ||
                    str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' ||
                    str.charAt(i)=='u' || str.charAt(i)=='U' ){
                vowel++;
            }
            else
                consonant++;
        }

        System.out.println("Vowels are::"+vowel);
        System.out.println("Consonant are::"+consonant);
    }
}

//Output-
//        Enter String:
//        Coditas Solutions
//        Vowels are::7
//        Consonant are::10
