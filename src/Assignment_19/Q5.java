package Assignment_19;

import java.util.Scanner;

class Case1{
    public void StudentData(){
        Scanner sc=new Scanner(System.in);
        String name; int id;Float Marks;
        System.out.println("Enter Name ");
        name=sc.nextLine();
        System.out.println("Enter ID ");
        id=sc.nextInt();
        System.out.println("Enter Marks ");
        Marks=sc.nextFloat();
        System.out.println("Name : "+ name +"\n ID : "+id+"\n Marks : "+ Marks);

    }
}


class Case2{
    public void StudentData(){
        Scanner sc=new Scanner(System.in);
        String name,id,marks;
        System.out.println("Enter Name ");
        name=sc.nextLine();
        System.out.println("Enter ID ");
        id=sc.nextLine();
        System.out.println("Enter Marks ");
        marks=sc.nextLine();
        System.out.println("Name : "+ name +"\n ID : "+id+"\n Marks : "+ marks);

    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean Exit=true;
        while (Exit){
            System.out.println("Enter : \n 0 : Exit \n 1. NextLine \n 2. String Sequence ");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();

            switch(choice){
                case 0:
                    Exit=false;
                    break;

                case 1:
                    Case1 case1= new Case1();
                    case1.StudentData();
                    break;

                case 2:
                    Case2 case2= new Case2();
                    case2.StudentData();
                    break;

                default:
                    System.out.println("Enter valid option");
            }
        }
    }
}
