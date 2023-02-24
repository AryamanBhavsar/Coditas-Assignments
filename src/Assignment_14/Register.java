package Assignment_14;

import java.util.Scanner;

public class Register {
    public  void CheckCriteria(int amount,int balance){
            if(amount<=0){
                try {
                    throw new InvalidAmountException("Amount is negative or zero");
                } catch (InvalidAmountException e) {
                    e.getMessage();
                }

            }

            if(amount>balance){
                try {
                    throw new InsufficientBalanceException();
                } catch (InsufficientBalanceException e) {
                    e.getMessage();
                }
            }


    }
}
