package Assignment_19.Stream_classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {


        try {
            File f1= new File("xyz.txt");
            Scanner sc = new Scanner(f1);
            while(sc.hasNextLine()){
                String fileData = sc.nextLine();
                System.out.println(fileData);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

