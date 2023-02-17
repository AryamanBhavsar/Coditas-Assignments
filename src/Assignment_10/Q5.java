package Assignment_10;

//Q5.To demonstrate ENUM

public class Q5 {


    public enum RED{STOP};
    public enum GREEN{GO};
    public enum YELLOW{DRIVE};

    public enum signal{
        STOP,
        GO,
        DRIVE_VERY_SLOW
    }


    public static void main(String[] args) {


        signal s1 = signal.STOP;
        System.out.println("RED MEAN "+s1);

        signal s = signal.GO;
        System.out.println("GREEN MEAN "+s);

        signal s2 = signal.DRIVE_VERY_SLOW;
        System.out.println("YELLOW MEAN "+s2);

    }
}
//Output-
//
//        RED MEANS STOP
//        GREEN MEANS GO
//        YELLOW MEANS DRIVE_VERY_SLOW
