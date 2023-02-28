package Assignment_15;


class DemoQ3 implements Runnable{

    @Override
    public void run() {
        System.out.println("This is run class by implementing the Runnable interface");
        System.out.println(Thread.currentThread());
    }
}

public class Q3 {
    public static void main(String[] args) {

        DemoQ3 demoQ3=new DemoQ3();
        Thread th = new Thread(demoQ3);
        Thread th2 = new Thread(demoQ3);
        Thread th3 = new Thread(demoQ3);

        th.start();

        th2.setName("A");
        th2.start();

        System.out.println(th3.isDaemon());
        System.out.println(th3.isAlive());
    }
}
//
//Output-
//        false
//        This is run class by implementing the Runnable interface
//This is run class by implementing the Runnable interface
//Thread[Thread-0,5,main]
//        Thread[A,5,main]
//        false