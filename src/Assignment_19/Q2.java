package Assignment_19;

import java.io.*;

public class Q2 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos1 = new FileOutputStream("abc.txt");
        FileOutputStream fos2 = new FileOutputStream("xyz.txt");

        String s="Hello all";
        String t="My name is Aryaman";

        byte[] b = s.getBytes();
        byte[] c = t.getBytes();

        fos1.write(b);
        fos2.write(c);

        FileOutputStream newFile = new FileOutputStream("result.txt");
        FileInputStream fis1 = new FileInputStream("abc.txt");
        FileInputStream fis2 = new FileInputStream("xyz.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);

        int i=0;
        while((i=sis.read())!=-1){
            newFile.write((char)i);
        }

        FileInputStream newfis = new FileInputStream("result.txt");
        int j=0;

        while ((j=newfis.read())!=-1){
            System.out.print((char)j);
        }

    }
}
//
//Output-
//        Hello allMy name is Aryaman