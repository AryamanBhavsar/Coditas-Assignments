package Assignment_19.Stream_classes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream {
    public static void main(String[] args) throws IOException {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream("abc.txt");

            FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
            //fileOutputStream.write(66);
            fileOutputStream.write(65);
            fileOutputStream.write(66);


            System.out.println(fileInputStream.read());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

