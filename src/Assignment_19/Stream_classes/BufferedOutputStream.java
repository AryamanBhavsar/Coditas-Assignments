package Assignment_19.Stream_classes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("xyz.txt");
        java.io.BufferedOutputStream bout = new java.io.BufferedOutputStream(fileOutputStream);

        String s = "Hello all";
        byte b[] = s.getBytes();

        bout.write(b);
        bout.flush();
        bout.close();
        fileOutputStream.close();
    }
}

