package Assignment_19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q3 {
        public static void main(String[] args) throws IOException
        {

            FileOutputStream fos = new FileOutputStream("qwe.txt");
            FileOutputStream fos1 = new FileOutputStream("rty.txt");

            java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();

            baos.write(66);
            baos.writeTo(fos1);
            baos.writeTo(fos);
        }

}
