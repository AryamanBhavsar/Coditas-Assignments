package Assignment_19;
import java.io.*;
import java.util.Scanner;


class ScannerInput{
    public void StudentData(){
        Scanner sc=new Scanner(System.in);
        String name; int id;Float Marks;
        System.out.println("Enter Name ");
        name=sc.nextLine();
        System.out.println("Enter ID ");
        id=sc.nextInt();
        System.out.println("Enter Marks ");
        Marks=sc.nextFloat();
        System.out.println("Scanner Output : ");
        System.out.println("Name : "+ name +"\n ID : "+id+"\n Marks : "+ Marks);
        System.out.println("------------------------------");

    }

}

class BufferedReaderDemo{

    public void buffereaderInput() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter student name: ");
        String name = bf.readLine();

        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(bf.readLine());

        System.out.print("Enter student marks: ");
        double marks = Double.parseDouble(bf.readLine());

        System.out.println("BufferedReader Output : ");
        System.out.println("Name : "+ name +"\n ID : "+id+"\n Marks : "+ marks);
        System.out.println("-------------------------------------");
    }
}

class ConsoleDemo {
    public void inputUsingConsole() {
        Console c = System.console();
        if (c == null) {
            System.out.println("No console available");
            System.exit(0);
        }

        System.out.print("Enter student name: ");
        String name = c.readLine();
        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(c.readLine());
        System.out.print("Enter student marks: ");

        float marks = Float.parseFloat(c.readLine());
        System.out.println("Console Output : ");
        System.out.println("Name : " + name + "\n ID : " + id + "\n Marks : " + marks);
        System.out.println("------------------------------");
    }
}



class CommandLineArgumentsInput{
    public void cmdArguments(String[] args){
        if(args.length != 3) {
            System.out.println("Please enter valid input in format: <id> <name> <marks>");
            System.exit(0);
        }
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        float marks = Float.parseFloat(args[2]);
        System.out.println("Command Line Output : ");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class Q6 {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        boolean Exit=true;
        while (Exit){
            System.out.println("Enter : \n 0 : Exit \n 1. ScannerInput  \n 2. Buffered Reader \n 3. Console \n 4.Command Line ");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();

            switch(choice){
                case 0:
                    Exit=false;
                    break;

                case 1:
                    ScannerInput scannerInput=new ScannerInput();
                    scannerInput.StudentData();
                    break;

                case 2:
                    BufferedReaderDemo  bufferedReaderDemo=new BufferedReaderDemo();
                    bufferedReaderDemo.buffereaderInput();
                    break;

                case 3:
                    ConsoleDemo consoleDemo=new ConsoleDemo();
                    consoleDemo.inputUsingConsole();
                    break;

                case 4:
                    CommandLineArgumentsInput commandLineArgumentsInput = new CommandLineArgumentsInput();
                    String[] arg = {"1", "Aryaman", "83.2"};
                    commandLineArgumentsInput.cmdArguments(arg);
                    break;


                default:
                    System.out.println("Enter valid option");
            }
        }
    }
}