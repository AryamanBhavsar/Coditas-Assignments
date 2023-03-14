package Assignment_19.Stream_classes;

import java.io.IOException;

public class FileOutputStream {
    public static void main(String[] args) throws IOException {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream("abc.txt");

        String s = "My name is Aryaman Bhavsar";
        byte b[] = s.getBytes();

        fileOutputStream.write(b);
        fileOutputStream.close();

        System.out.println("Done");
    }
}

