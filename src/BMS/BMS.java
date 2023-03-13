package BMS;

import java.io.IOException;
import java.util.Scanner;

import static BMS.Operations.list;

public class BMS {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Operations operations = new Operations();
        boolean flag = true;

        while (flag){
            System.out.println("0.EXIT");
            System.out.println("1.ADD BANK ACCOUNT");
            System.out.println("2.DEPOSIT");
            System.out.println("3.WITHDRAW");
            System.out.println("4.DISPLAY ALL ACCOUNT DETAILS");
            int choice = sc.nextInt();

            switch (choice){
                case 0:
                    System.out.println("Thank-You, Visit again");
                    flag=false;
                    break;

                case 1:
                    operations.addBankAcc();
                    break;

                case 2:
                    operations.Deposit();
                    break;

                case 3:
                    operations.Withdrawl();
                    break;

                case 4:
                    operations.DisplayDetails();
                    break;

                default:
                    System.out.println("Enter Valid input!!");
                    break;
            }
            
        }
    }
}
