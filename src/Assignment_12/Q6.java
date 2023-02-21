package Assignment_12;

public class Q6 {
    public static void main(String[] args) {

        String str = "My name is Aryaman Bhavsar";

        String arr[] = null;
        arr = str.split(" ");

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
//Output-
//        My
//        name
//        is
//        Aryaman
//        Bhavsar
