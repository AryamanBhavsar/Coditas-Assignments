package SMS;

public class StudentNotExistException extends Throwable{
    public StudentNotExistException() {
        System.out.println("No Such Student Exist!!");
    }
}
