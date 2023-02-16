package Assignment_10;

//Q3. To prove after changing the return type, overriding happens or not.

class Parent{
    Parent display(){
        System.out.println("Parent display");
        return this;
    }
}

class Child extends Parent{
    Child display(){
        System.out.println("Child Display");
        return this;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();
    }
}
//
//Output-
//        Child Display