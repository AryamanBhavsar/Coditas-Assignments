package Assignment_7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Order{
    Integer array1[]={1,2,6,7,8,5,3,5,6,8};

    public void Ascending(){
        Arrays.sort(array1);
        for (int element:array1) {
            System.out.print(element+"");
        }
    }

    public void Descending(){
      Arrays.toString(array1);
      Arrays.sort(array1, Collections.reverseOrder());

        for (int element:array1) {
            System.out.print(element+"");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println();
        System.out.println("**********Ascending Order************");
        order.Ascending();

        System.out.println();
        System.out.println("**********Descending Order************");
        order.Descending();

    }
}

//Output-
//**********Ascending Order************
//        1235566788
//**********Descending Order************
//        8876655321