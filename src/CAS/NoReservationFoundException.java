package CAS;

public class NoReservationFoundException extends Throwable{
    public NoReservationFoundException() {
        System.out.println("No Reservation Found!!");
    }
}
