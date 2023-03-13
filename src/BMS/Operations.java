package BMS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Operations {

    ArrayList<Customer> list = new ArrayList<Customer>();
    //Scanner sc = new Scanner(System.in);
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    public void addBankAcc()throws IOException {

        Random random = new Random();
        long accNo = random.nextLong()%100000000000L;
        if (accNo < 0) {
            accNo += 1000000000000L;
        }
        System.out.println("Enter Name:");
        String name = sc.readLine();
        System.out.println("Enter Address:");
        String address = sc.readLine();
        System.out.println("Enter Phone Number:");
        int pNo = Integer.parseInt(sc.readLine());
        System.out.println("Enter Email:");
        String email = sc.readLine();
        System.out.println("Enter Account type(Current/Savings):");
        String accType = sc.readLine();
        if(accType.equalsIgnoreCase("current")){
            System.out.println("Enter Company Name:");
            String cName = sc.readLine();
            list.add(new Customer(name,address,email,accType,cName,pNo,accNo));
        }

        else {
            list.add(new Customer(name,address,email,accType,pNo,accNo));
        }
        System.out.println("Your Account Number is: " + accNo);

    }

    public void Deposit() throws IOException{
        long accNo;
        System.out.println("Enter Account Number:");
        while(true) {
            try {
                accNo = Long.parseLong(sc.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid Input!!");
            }
        }

        for (Customer c:list) {
            if(accNo==c.accNo){
                System.out.println("CURRENT BALANCE: Rs."+c.getAccBal());
                System.out.println("Enter Amount to deposit:");
                int DepAmount = Integer.parseInt(sc.readLine());
                c.accBal += DepAmount;
                System.out.println("DEPOSIT SUCESSFULL!");
                System.out.println("CURRENT BALANCE: Rs."+c.getAccBal());
            }

            else {
                try {
                    throw new AccountNotPresentException();
                } catch (AccountNotPresentException e) {
                    e.getMessage();
                }
            }
        }
    }

    public void Withdrawl() throws IOException {
        long accNo;
        System.out.println("Enter Account Number:");
        while(true) {
            try {
                accNo = Long.parseLong(sc.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid Input!!");
            }
        }

        for (Customer c:list) {
            if(accNo==c.accNo){
                System.out.println("CURRENT BALANCE: Rs."+c.getAccBal());
                System.out.println("Enter Amount to Withdrawl:");
                int wAmount = Integer.parseInt(sc.readLine());
                if(wAmount>c.accBal){
                    try {
                        throw new InsufficientBalanceException();
                    } catch (InsufficientBalanceException e) {
                        e.getMessage();
                    }
                }
                else {
                    c.accBal -= wAmount;
                    System.out.println("WITHDRAWL SUCESSFULL!");
                    System.out.println("CURRENT BALANCE: Rs."+c.getAccBal());
                }
            }

            else {
                try {
                    throw new AccountNotPresentException();
                } catch (AccountNotPresentException e) {
                    e.getMessage();
                }
            }
        }
    }


    public void DisplayDetails() throws IOException {
        long accNo;
        while (true){
            System.out.println("Enter Account Number:");
        try {
            accNo = Long.parseLong(sc.readLine());
            break;
        } catch (Exception e) {
            System.out.println("Input Mismatch!");
        }
    }

        for (Customer c:list) {
            if(accNo==c.accNo) {
                if(c.accType.equalsIgnoreCase("current")){
                    System.out.println("------------------------------");
                    System.out.println("Name:        | "+c.getName());
                    System.out.println("Phone No:    | "+c.getPhoneNo());
                    System.out.println("Account Type:| "+c.getAccType());
                    System.out.println("Company Name:| "+c.getcName());
                    System.out.println("Balance:     | "+c.getAccBal());
                    System.out.println("------------------------------");
                }

                else{
                    System.out.println("------------------------------");
                    System.out.println("Name:        | "+c.getName());
                    System.out.println("Phone No:    | "+c.getPhoneNo());
                    System.out.println("Account Type:| "+c.getAccType());
                    System.out.println("Balance:     | "+c.getAccBal());
                    System.out.println("------------------------------");
                }

            }
            else {
                try {
                    throw new AccountNotPresentException();
                } catch (AccountNotPresentException e) {
                    e.getMessage();
                }
            }
        }
    }
}
