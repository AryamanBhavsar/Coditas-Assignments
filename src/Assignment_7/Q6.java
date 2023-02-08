package Assignment_7;

import java.util.Scanner;

class FetchElement{

    int array[]={1,2,4,6,4,3,6};

    public void Fetch(int index){
        System.out.println("Element "+array[index]+" is at index "+ index);
    }

    public void display(){
        System.out.print("Array is:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FetchElement fetchElement = new FetchElement();
        fetchElement.display();

        System.out.println();
        System.out.println("Enter the index:");
        int input = sc.nextInt();

        fetchElement.Fetch(input);

    }
}
