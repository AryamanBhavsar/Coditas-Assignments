package SMS;

public class MarksNotInRangeException extends Throwable{
    public MarksNotInRangeException() {
        System.out.println("Marks not in range of 0-100!!");
    }
}
