package Assignment_14;

public class InvalidAmountException extends Throwable {
    InvalidAmountException(){
        System.out.println("Enter Valid Amount!!!");
    }

    InvalidAmountException(String s){
        System.out.println("Enter Valid Amount!!!"+s);
    }
}
