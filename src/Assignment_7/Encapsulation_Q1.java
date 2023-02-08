package Assignment_7;

import java.util.Scanner;
import java.util.SortedMap;

class BankSystem{
    private int accountnumber;
    private String name, address;
    private double amount;

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void debit(double rupee){
        amount=amount-rupee;
    }
    public void credit(double rupee){
        amount=amount+rupee;
    }

    @Override
    public String toString() {
        return "BankSystem{" +
                "accountnumber=" + accountnumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", amount=" + amount +
                '}';
    }
}

public class Encapsulation_Q1 {
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PIN:");
        int pin1=sc.nextInt();

        if(pin1==1234){

            BankSystem bankSystem=new BankSystem();
            bankSystem.setAccountnumber(170117);
            bankSystem.setName("Aryaman");
            bankSystem.setAddress("Indore,(M.P)");
            bankSystem.setAmount(5000);

            System.out.println("************Enter your choice***********");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Check Status");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Current Balance is: "+bankSystem.getAmount());
                    break;

                case 2:
                    System.out.println("Enter amount: ");
                    int amt = sc.nextInt();

                    if(amt<=bankSystem.getAmount()) {
                        bankSystem.debit(amt);
                        System.out.println("Rs." + amt + " Debited Sucessfully");
                        System.out.println("Debited Account balance is " + bankSystem.getAmount());
                    }

                    else {
                        System.out.println("Not Enough funds available!!");
                    }
                    break;

                case 3:
                    System.out.println("Enter amount: ");
                    int amt2 = sc.nextInt();
                    bankSystem.credit(amt2);
                    System.out.println("Rs."+amt2+" Credited Sucessfully");
                    System.out.println("Account balance is "+bankSystem.getAmount());
                    break;

                case 4:
                    System.out.println(bankSystem);
                    break;
            }


        }

        else {
            System.out.println("Invalid PIN!!");
        }

    }
}
