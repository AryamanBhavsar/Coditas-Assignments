package Assignment_10;

class Rectangle implements ShapeInterface{

    int l;
    int b;

    Rectangle(){
        int l=0;
        int b=0;
    }

    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }

    int area;
    @Override
    public void getArea() {
        area = l*b;
    }

    @Override
    public void toStrings() {
        System.out.println("Area of rectangle is::"+area);
    }

}

class Triangle implements ShapeInterface{

    int l;
    int b;

    Triangle(){
        l=0;
        b=0;
    }

    Triangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    int area;
    @Override
    public void getArea() {
        area = l*b/2;
    }

    @Override
    public void toStrings() {
        System.out.println("Area of Triangle is::"+area);
    }

}

public class Q6 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3,6);
        rectangle.getArea();
        rectangle.toStrings();

        Triangle triangle = new Triangle(3,7);
        triangle.getArea();
        triangle.toStrings();
    }
}
//
//Output-
//
//        Area of rectangle is::32
//        Area of Triangle is::20
