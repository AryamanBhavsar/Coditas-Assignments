package Assignment_13;

public class Q5 {
    public static void main(String[] args) {
        int array[] = new int[10];
        int sum=0;

        try {
            for(int i=0;i<11; i++){
                sum = sum + array[i];
            }
        } catch (Exception e) {
            System.out.println("Array index out of bound!!!!");
        }

    }
}
