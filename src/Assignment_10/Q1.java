package Assignment_10;

//Q1. Create a class shape to implement Method Overloading

class Shape{

    public void calculateArea(int side){
        int Result = side*side;
        System.out.println("Area of Square is::"+Result);
    }

    public void calculateArea(int length, int breadth){
        int Result = length*breadth;
        System.out.println("Area of Rectangle is::"+Result);
    }

    public void calculateArea(float radius){
        float pie = 3.14f;
        float Result = pie*radius*radius;
        System.out.println("Area of Circle is::"+Result);
    }

}

public class Q1 {
    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.calculateArea(5);
        shape.calculateArea(20,30);
        shape.calculateArea(4.2f);

    }
}
//
//Output-
//
//        Area of Square is::25
//        Area of Rectangle is::600
//        Area of Circle is::55.389595

