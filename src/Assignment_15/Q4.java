package Assignment_15;

class DemoQ4 implements Runnable{
    public void run(){
        for(int i=1;i<10;i=i+2){
            System.out.println(i);
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        DemoQ4 demoQ4 = new DemoQ4();
        Thread th = new Thread(demoQ4);

        th.start();

    }
}
//
//Output-
//        1
//        3
//        5
//        7
//        9