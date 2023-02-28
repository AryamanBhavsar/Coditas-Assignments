package Assignment_15;

//When it comes to restarting any thread, If we do so, it given us an error because as we know that any
//thread has only 5 stages of life cycle. They are-
//  1) Create
//  2) Runnable
//  3) Running
//  4) Non-Runnable States
//  5) Dead

//After it becomes dead, a thread can't be restarted again. It is usually like the human life.
//So it shows an error for the same.

class Demo extends Thread{
    public void run(){
        System.out.println("This is run method");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.start();
        demo.start();
    }
}
//
//Output-
//        Exception in thread "main" java.lang.IllegalThreadStateException
//        at java.base/java.lang.Thread.start(Thread.java:793)
//        at Assignment_15.Q1.main(Q1.java:13)
//        This is run method