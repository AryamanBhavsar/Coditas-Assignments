package Assignment_15;

//We can call run()  method explicitly, it won't show any error. But the thing is that when we use a
//start method, then a seperate stack is being created. If we use a run() method, then new stacck  won't be created and
//we will not be able to achieve context switching.


class DemoQ2 extends Thread{
    public void run(){
        System.out.println("This is run method");
    }
}

public class Q2 {
    public static void main(String[] args) {
        DemoQ2 demoQ2 = new DemoQ2();
        demoQ2.run();
    }
}
//
//Output-
//        This is run method
