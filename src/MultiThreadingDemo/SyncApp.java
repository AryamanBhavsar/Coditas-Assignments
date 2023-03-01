package MultiThreadingDemo;

class Printer{
    void printDocuments(int numOfCopies,String docName){
        for(int i=1;i<=numOfCopies;i++){
            System.out.println(">>Printing "+docName+" "+i);
        }
    }
}

class MyThread extends Thread{
    Printer pRef;

    MyThread(Printer p){
        this.pRef = p;
    }

    public void run(){
        synchronized (this){
            pRef.printDocuments(10,"Aryaman's Doc");
        }

    }
}

class YourThread extends Thread{
    Printer pRef;

    YourThread(Printer p){
        this.pRef = p;
    }

    public void run(){
        synchronized (this){
            pRef.printDocuments(10,"Bala's Doc");
        }
    }
}

public class SyncApp {
    public static void main(String[] args) {
        System.out.println("=====Application Started=====");

        Printer printer = new Printer();


        MyThread mRef = new MyThread(printer);
        YourThread yRef = new YourThread(printer);

        mRef.start();
        yRef.start();

        System.out.println("=====Application Ended=====");
    }
}
