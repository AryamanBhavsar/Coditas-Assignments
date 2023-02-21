package Assignment_12;

import java.util.Arrays;
import java.util.StringTokenizer;

class TokenDemo{
    public void display(){

        String str = "Hi all. How are you?";
        String arr[] = str.split("[ ,.?]");

        for (String str1: arr) {
            System.out.println(str1);
        }

    }
}

public class Q7 {
    public static void main(String[] args) {
        TokenDemo tokenDemo = new TokenDemo();
        tokenDemo.display();
    }
}
//
//Output-
//        Hi
//        all
//
//        How
//        are
//        you