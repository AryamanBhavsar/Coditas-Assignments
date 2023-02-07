package Assignment_6;

public class Q8_2_1 {
    public static void main(String[] args) {
        int rows=5;

        for(int i=rows;i>=1;i--){
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
