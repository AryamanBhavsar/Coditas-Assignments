package Assignment_9;

abstract class Shape{
    abstract void area();
}

class Circle extends Shape{
    double radius;

    public Circle(int i) {
        this.radius=i;
    }

    @Override
    void area() {
        System.out.println("Area of circle is:"+3.14*radius*radius);
    }
}

class Square extends Shape{

    double side;

    public Square(int i) {
        this.side = i;
    }

    @Override
    void area() {
        System.out.println("Area of square is:"+side*side);
    }
}

class Cylinder extends Circle{
    double radius;
    double height;

    public Cylinder(int i, int i1) {
        super(i);
        this.height = i1;
    }

    @Override
    void area() {
        System.out.println("Area of Cylinder is:"+(2 * Math.PI * radius * height + 2 * Math.PI * radius * radius));
    }
}

class Rectangle extends Square{
    double length;
    double breadth;

    public Rectangle(int i, int i1) {
        super(i);
        this.breadth = i1;
        this.length=i;
    }

    @Override
    void area() {
        System.out.println("Area of rectangle is:"+2*(length+breadth));
    }
}
public class Q4 {

    public static void main(String[] args) {

        Shape shape[] = new Shape[4];
        shape[0]=new Circle(5);
        shape[1]=new Cylinder(4,7);
        shape[2]=new Square(6);
        shape[3]=new Rectangle(4,6);

        for (Shape shapes : shape) {
            shapes.area();
        }
    }
}
//
//Output-
//        Area of circle is:78.5
//        Area of Cylinder is:0.0
//        Area of square is:36.0
//        Area of rectangle is:20.0