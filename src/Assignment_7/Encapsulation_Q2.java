package Assignment_7;

class Rectangle{
    private int length,breadth,result;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", result=" + result +
                '}';
    }
}

public class Encapsulation_Q2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setBreadth(10);

        rectangle.setResult(rectangle.getLength()*rectangle.getBreadth());
        System.out.println(rectangle);
        System.out.println("Result= "+rectangle.getResult());
    }
}

//Output-
//        Rectangle{length=5, breadth=10, result=50}
//        Result= 50