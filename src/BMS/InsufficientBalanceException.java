package BMS;

public class InsufficientBalanceException extends Throwable{

    public InsufficientBalanceException(){
        System.out.println("Not enough Balance!!");
    }
}
