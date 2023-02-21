package Assignment_12;

public class Q4 {
    public static void main(String[] args) {
        String sentence = "          Hello all how are you???        ";

        System.out.println(sentence.trim());
        System.out.println(sentence.codePointAt(5));

    }
}

//Output-
//        Hello all how are you???
//        32
