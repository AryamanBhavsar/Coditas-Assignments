package Assignment_12;

public class Q3 {
    public static void main(String[] args) {
        String str="aryaman";
        String newstr = new String();
        int length = str.length();
        for (int i = 0; i < length; i++)
        {
            char charAtPosition = str.charAt(i);
            if (newstr.indexOf(charAtPosition) < 0)
            {
                newstr += charAtPosition;
            }
        }
        System.out.println(newstr);

    }
}
