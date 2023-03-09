package SMS;

public class PrintResult {
    public void print(Student s){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("          RESULT            ");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("   SUBJECT   |    MARKS     ");
        System.out.println("----------------------------");
        System.out.println("   English   |    "+s.marks[0]+"   ");
        System.out.println("   Hindi     |    "+s.marks[1]+"   ");
        System.out.println("   Maths     |    "+s.marks[2]+"   ");
        System.out.println("   Physics   |    "+s.marks[3]+"   ");
        System.out.println("   Chemistry |    "+s.marks[4]+"   ");
        System.out.println("------------------------------");
        System.out.println("NAME::"+s.getName());
        System.out.print("RESULT:");
        boolean flag=true;
        for(int i=0;i<5;i++){
            if(s.marks[i]<35){
                flag=false;
            }
        }
        if(flag){
            System.out.println("PASS");
        }
        else
            System.out.println("FAIL!");

        System.out.println("------------------------------");
    }
}
