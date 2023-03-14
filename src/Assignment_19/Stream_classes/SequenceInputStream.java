package Assignment_19.Stream_classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SequenceInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        FileInputStream fis1 = new FileInputStream("xyz.txt");
        FileOutputStream fos = new FileOutputStream("pqr.txt");
        java.io.SequenceInputStream sis = new java.io.SequenceInputStream(fis,fis1);

        int j=0;

        while((j=sis.read())!=-1){
            fos.write(j);
        }
        sis.close();
        fis1.close();
        fis.close();
    }
}

