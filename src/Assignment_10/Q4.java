package Assignment_10;

//Q4.To perform overloading using VARARGS.

class Addition{
    public void add(int a, int b){
        int Result = a+b;
        System.out.println("Sum of 2 numbers is::"+Result);
    }

    public void add(int a, int b,int c){
        int Result = a+b+c;
        System.out.println("Sum of 3 numbers is::"+Result);
    }
}

class VarargsAddition{
    public void add(int ... a){
        int sum=0;

        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }

        System.out.println("Sum of VarArgs is::"+sum);
    }
}

public class Q4 {
    public static void main(String[] args) {


        Addition addition = new Addition();
        addition.add(13,2);
        addition.add(3,7,5);

        VarargsAddition varargsAddition = new VarargsAddition();
        varargsAddition.add(1,2,3,5,6,7);
        varargsAddition.add(2,3,4,2,3,4,4,5,6,67,7,8);

    }
}
//
//Output-
//    Sum of 2 numbers is::15
//        Sum of 3 numbers is::15
//        Sum of VarArgs is::24
//        Sum of VarArgs is::115