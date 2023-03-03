package CAS;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PlaceOrder{
    public void order(){
        final String Menu[]={"Tea","Coffee","Pizza","Burger","Shakes","Maggie","Pav-Bhaji"};
        HashMap<String,Integer> order = new HashMap<String,Integer>();
        HashMap<String,Integer> MenuPrice = new HashMap<String,Integer>();
        MenuPrice.put("Tea", 10);
        MenuPrice.put("Coffee", 30);
        MenuPrice.put("Pizza", 100);
        MenuPrice.put("Burger", 70);
        MenuPrice.put("Shakes", 120);
        MenuPrice.put("Maggie", 50);
        MenuPrice.put("Pav-Bhaji", 80);
        PrintMenu printMenu = new PrintMenu();

        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        int bill=0;
        int quantity=0;

        while(flag){
            printMenu.print();
            System.out.println("Enter 0 to stop ordering!");
            System.out.println("Enter Dish Number:");
            int choice = sc.nextInt();
            if(choice<=7){
                if(choice==0){
                    flag=false;
                }
                else{
                    System.out.println("Enter Quantity:");
                    quantity = sc.nextInt();
                    bill = bill+MenuPrice.get(Menu[choice-1])*quantity;
                    order.put(Menu[choice-1],quantity);
                }
            }
            else {
                System.out.println("Enter Valid Choice!!!");
            }

        }

        if (!order.containsKey("Coffee")) {
            try {
                throw new InvalidOrderException();
            } catch (Throwable e) {
                  e.getMessage();
            }
        }

        else{

            Random random = new Random();
            int billNumber = random.nextInt(10000) + 1;

            System.out.println("************************");
            System.out.println("BILL NUMBER #"+billNumber);

            System.out.println("-------------------------");
            System.out.println("Name       " + "Quantity   ");
            System.out.println("-------------------------");

            for (String i : order.keySet()) {
                System.out.println(i +"   "+ "         "+order.get(i));
            }

            System.out.println("TOTAL BILL: Rs."+bill);
            System.out.println("-------------------------");
        }

    }

    public static void main(String[] args) {

        PlaceOrder placeOrder = new PlaceOrder();
        placeOrder.order();
    }
}
