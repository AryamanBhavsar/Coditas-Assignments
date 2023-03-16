package SMS_JDBC;

public class DuplicateStudentException extends Throwable{
    DuplicateStudentException(){
        System.out.println("Student already Exist!!");
    }
}
