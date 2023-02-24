package Assignment_14;

public class InsufficientBalanceException extends Throwable {
    InsufficientBalanceException(){
        System.out.println("Insufficient Balance");
    }

    InsufficientBalanceException(String s){
        System.out.println("You don't have sufficient amount!!!!"+s);
    }
}
