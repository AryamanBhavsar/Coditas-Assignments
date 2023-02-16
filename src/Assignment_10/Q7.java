package Assignment_10;

//VarArgs:
//VarArgs in java are used when we see the concept of method overloading. In case of method overloading,
//we might need to create multiple methods with same name but different parameters. But we are not sure about
//the number of parameters that might be required in the method. So to solve that issue, we have a function i.e VarArgs
//which will accept any number of parameters from the methods and will perform the required business logic.
//(FOR ITS IMPLEMENTATION, PLEASE REFER QUESTION-4 IN THE SAME PACKAGE)

//CoVariant Return type:
//Covariant return type is used in java when we create a method same and we need to return some value. For eg- in case
//of int, we write return 0; . So to get the appropriate return type which is same as the subclass type, we use a
//keyword named as ( return this ) . This keyword return appropriate value as per the subclass.
//(ITS IMPLEMENTATION IS GIVEN IN THIS CODE)

class Parent1{
    Parent1 show(){
        System.out.println("Class Parent");
        return this;
    }
}

class Child1 extends Parent1{
    Child1 show(){
        System.out.println("Class Child");
        return this;
    }
}

public class Q7 {
    public static void main(String[] args) {
       Child1 child1 = new Child1();
       child1.show();
    }
}
