package Assignment_7;

class Copy{
    int array1[]={1,2,4,56,7,8,8,9};
    int array2[]=array1.clone();

    public void display(){
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }
}

public class Q3 {
    public static void main(String[] args) {

        Copy copy = new Copy();
        copy.display();

    }
}
