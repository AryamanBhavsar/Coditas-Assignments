package Assignment_6;

public class Q8_3_2 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i<=rows; i++) {
            char ch='A';
            for(int j=1;j<=i;j++){
                    System.out.print(ch++);
            }
            ch--;
            for(int k=2;k<=i;k++){
                System.out.print(--ch);
            }
            System.out.println();
        }
    }
}