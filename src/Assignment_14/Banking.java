package Assignment_14;

public class Banking {
    public static void main(String[] args) {
        Register register = new Register();

        System.out.println("************Scenerio-1*************");
        register.CheckCriteria(-11101010,5256);
        System.out.println();

        System.out.println("************Scenerio-2*************");
        register.CheckCriteria(6000,5256);
        System.out.println();

        System.out.println("************Scenerio-3*************");
        register.CheckCriteria(5000,5256);
        System.out.println();
    }
}

//Output-
//        ************Scenerio-1*************
//        Enter Valid Amount!!!Amount is negative or zero
//
//        ************Scenerio-2*************
//        Insufficient Balance
//
//        ************Scenerio-3*************
