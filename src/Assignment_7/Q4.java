package Assignment_7;

class Duplicate {
    int array1[] = {1, 4, 7, 3, 4, 5};
    int anotherArray[]=new int[array1.length - 1];;
    int duplicateIndex = -1;

    public void display(){
        System.out.print("Original Array:");
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]);
        }
    }

    public int findDuplicate() {
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    System.out.println("Duplicate element is:" + array1[i]);
                    duplicateIndex = j;
                    System.out.println("Duplicate element index is: " + j);
                }
            }

        }
        return duplicateIndex;
    }

    public void RemoveDuplicate(){
        for (int i = 0, k = 0; i < array1.length; i++) {
            if (i == duplicateIndex) {
                continue;
            }
            anotherArray[k++] = array1[i];
        }

        System.out.print("New Array is:");
        for(int i=0;i<anotherArray.length;i++){
            System.out.print(anotherArray[i]);
        }
    }
}


public class Q4 {
    public static void main(String[] args) {

        Duplicate duplicate = new Duplicate();

        duplicate.display();
        System.out.println();

        duplicate.findDuplicate();
        System.out.println();

        duplicate.RemoveDuplicate();
        System.out.println();

    }
}


//Output-
//Original Array:147345
//        Duplicate element is:4
//        Duplicate element index is: 4
//
//        New Array is:14735
