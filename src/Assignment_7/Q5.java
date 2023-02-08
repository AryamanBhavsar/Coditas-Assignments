package Assignment_7;

class Jagged{
    int array1[][]={{1,2},{1,2,3,4}};
    int array2[][]= {{5,6}, {4,5,6,7}};
    int sum=0;

    public void display(){

        System.out.println("First Array:");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++)
                System.out.print(array1[i][j] + " ");
            System.out.println();
        }

        System.out.println("Second Array:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++)
                System.out.print(array2[i][j] + " ");
            System.out.println();
        }
    }

    public void add(){
        System.out.println("Sum of Arrays");
        for(int i = 0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                sum = array1[i][j] + array2[i][j];
                System.out.println("Sum of Array[" + i + "][" + j + "] is : " + sum);
            }
        }
    }
}

public class Q5 {
    public static void main(String[] args) {

        Jagged jagged = new Jagged();
        jagged.display();
        jagged.add();
    }
}
