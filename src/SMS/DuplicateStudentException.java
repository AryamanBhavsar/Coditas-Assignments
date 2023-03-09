package SMS;

public class DuplicateStudentException extends Throwable {
    public DuplicateStudentException() {
        System.out.println("Roll Number already Exist!!");
    }

}
