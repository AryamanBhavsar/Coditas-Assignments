package Assignment_19.Stream_classes;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        if(file.delete()){
            System.out.println("File "+file.getName()+" has been deleted");
        }
        else
            System.out.println("No such file found!");
    }
}

