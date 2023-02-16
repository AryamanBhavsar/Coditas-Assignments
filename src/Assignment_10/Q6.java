package Assignment_10;

class Rectangle implements ShapeInterface{

    int area;
    @Override
    public void getArea(int a,int b) {
        area = a*b;
    }

    @Override
    public void toStrings() {
        System.out.println("Area of rectangle is::"+area);
    }

}

class Triangle implements ShapeInterface{

    int area;
    @Override
    public void getArea(int a,int b) {
        area = a*b/2;
    }

    @Override
    public void toStrings() {
        System.out.println("Area of Triangle is::"+area);
    }

}

public class Q6 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.getArea(4,8);
        rectangle.toStrings();

        Triangle triangle = new Triangle();
        triangle.getArea(5,8);
        triangle.toStrings();
    }
}
//
//Output-
//
//        Area of rectangle is::32
//        Area of Triangle is::20
