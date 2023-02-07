package Assignment_6;

public class Q8_2_2 {
    public static void main(String[] args) {
        int rows=6;

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(j==1){
                    System.out.print("A");
                }
                if(j==2){
                    System.out.print("B");
                }
                if(j==3){
                    System.out.print("C");
                }if(j==4){
                    System.out.print("D");
                }if(j==5){
                    System.out.print("E");
                }if(j==6){
                    System.out.print("F");
                }
            }
            System.out.println();
        }

        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                if(j==1){
                    System.out.print("A");
                }
                if(j==2){
                    System.out.print("B");
                }
                if(j==3){
                    System.out.print("C");
                }if(j==4){
                    System.out.print("D");
                }if(j==5){
                    System.out.print("E");
                }if(j==6){
                    System.out.print("F");
                }
            }
            System.out.println();
        }

    }
}
