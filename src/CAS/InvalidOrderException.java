package CAS;

public class InvalidOrderException extends Exception {
    public InvalidOrderException() {
        System.out.println("No Coffee in order!!");
    }
}
