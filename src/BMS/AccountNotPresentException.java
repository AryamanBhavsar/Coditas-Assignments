package BMS;

public class AccountNotPresentException extends Throwable{
    public AccountNotPresentException() {
        System.out.println("Account Number Not present!!");
    }
}
