package Assignment_10;

//Q2. To prove after changing the return type, overloadinng happens or not.

class Vehicle{

    public void showDetails(){
        System.out.println("First Vehicle");
    }

    public int showDetails(int vehicleNo){
        System.out.println("This is Second Vehicle");
        return 0;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.showDetails();
        vehicle.showDetails(7330);

    }
}
//
//Output-
//        First Vehicle
//        This is Second Vehicle

