package Assignment_7;

import java.util.Arrays;

class ArrayFucntions{
    int array1[]={1,2,3,4,5,6,7,8};
    int array2[]={5,6,2,9,9,2,4,1};
    int array3[][] = { { 10, 20, 15, 22, 35 } };
    int array4[][] = { { 15, 20, 56, 32, 90 } };

    public void asList(){
        System.out.println("Arrays as list: "+ Arrays.asList(array1));
    }

    public void sort(){
        Arrays.sort(array2);
        for (int element:array2) {
            System.out.print(element+"");
        }
    }

    public void binarySearch(){
        int key=4;
        System.out.println(key + " found at index = " + Arrays.binarySearch(array1, key));
    }

    public void compare(){
        System.out.println(Arrays.compare(array1,array2));
    }

    public void copyOf(){
        System.out.println(Arrays.toString(Arrays.copyOf(array1,10)));
    }

    public void copyOfRange(){
        System.out.println(Arrays.toString(Arrays.copyOfRange(array1,2,5)));
    }

    public void deepEquals(){
        System.out.println(Arrays.deepEquals(array3,array4));
    }

    public void deepHashCode(){
        System.out.println(Arrays.deepHashCode(array3));
    }

    public void equals(){
        System.out.println(Arrays.equals(array1,array2));
    }

    public void mismatch(){
        System.out.println(Arrays.mismatch(array1,array2));
    }

    public void Tostring(){
        System.out.println(Arrays.toString(array1));
    }
}
public class Q1 {
    public static void main(String[] args) {

        ArrayFucntions arrayFucntions = new ArrayFucntions();

        System.out.println();
        System.out.println("*******Array as list********");
        arrayFucntions.asList();
        System.out.println();

        System.out.println("*******Sorted array********");
        arrayFucntions.sort();
        System.out.println();
        System.out.println();

        System.out.println("*******Binary Search*******");
        arrayFucntions.binarySearch();
        System.out.println();

        System.out.println("*******Array compare*******");
        arrayFucntions.compare();
        System.out.println();

        System.out.println("*******Array Copy*******");
        arrayFucntions.copyOf();
        System.out.println();

        System.out.println("*******Array Copy Range*******");
        arrayFucntions.copyOfRange();
        System.out.println();

        System.out.println("*******Array Deep Equals*******");
        arrayFucntions.deepEquals();
        System.out.println();

        System.out.println("*******Array Deep Hash Code*******");
        arrayFucntions.deepHashCode();
        System.out.println();

        System.out.println("*******Array Equals*******");
        arrayFucntions.equals();
        System.out.println();

        System.out.println("*******Array Mismatch*******");
        arrayFucntions.mismatch();
        System.out.println();

        System.out.println("*******Array to String*******");
        arrayFucntions.Tostring();
        System.out.println();
    }
}

//Output-
//
//        *******Array as list********
//        Arrays as list: [[I@776ec8df]
//
//        *******Sorted array********
//        12245699
//
//        *******Binary Search*******
//        4 found at index = 3
//
//        *******Array compare*******
//        1
//
//        *******Array Copy*******
//        [1, 2, 3, 4, 5, 6, 7, 8, 0, 0]
//
//        *******Array Copy Range*******
//        [3, 4, 5]
//
//        *******Array Deep Equals*******
//        false
//
//        *******Array Deep Hash Code*******
//        38475344
//
//        *******Array Equals*******
//        false
//
//        *******Array Mismatch*******
//        2
//
//        *******Array to String*******
//        [1, 2, 3, 4, 5, 6, 7, 8]

