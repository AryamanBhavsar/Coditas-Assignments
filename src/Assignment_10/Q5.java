package Assignment_10;

//Q5.To demonstrate ENUM

public class Q5 {


    public enum RED{STOP};
    public enum GREEN{GO};
    public enum YELLOW{DRIVE};


    public static void main(String[] args) {

        System.out.println("RED MEANS "+RED.valueOf("STOP"));

        GREEN green = GREEN.GO;
        System.out.println("GREEN MEANS "+green);

        System.out.println("YELLOW MEANS "+YELLOW.valueOf("DRIVE"));

    }
}
//Output-
//
//        RED MEANS STOP
//        GREEN MEANS GO
//        YELLOW MEANS DRIVE
