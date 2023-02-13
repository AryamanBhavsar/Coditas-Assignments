//Q1. Program to demonstate abstract class

package Assignment_9;
abstract class Vehicle{
    abstract void Engine();
}

class Car extends Vehicle{

    @Override
    void Engine() {
        System.out.println("Car has a good engine");
    }
}

class Truck extends Vehicle{

    @Override
    void Engine() {
        System.out.println("Truck has a bad engine");
    }
}


public class Q1 {

    public static void main(String[] args) {
        Truck tr = new Truck();
        tr.Engine();

        Car car = new Car();
        car.Engine();
    }
}

//Output-
//        Truck has a bad engine
//        Car has a good engine
