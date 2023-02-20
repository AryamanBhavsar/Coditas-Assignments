package Assignment_11;

class StringOps{
    public void display(){
        //String by literal
        String name1 = "Aryaman";
        String intro = "I live in Indore";

        //String by object
        String name2 = new String("Aryaman");

        //Char-at method
        System.out.println("Char-at method::"+name1.charAt(3));

        //Length
        System.out.println("Length method::"+name1.length());

        //format
        System.out.println(String.format("String format method::"+"My name is %s",name1));

        //Sub-string
        System.out.println("Substring method::"+name1.substring(2,4));

        //contains
        System.out.println("Contains method::"+name1.contains("aman"));

        //Equals method
        System.out.println("Equals method::"+name1.equals(name2));

        //Double equals ==
        System.out.println("Double equals method::"+ name1 == name2);

        //Is-empty method
        System.out.println("Is empty method::"+name1.isEmpty());

        //Concat method
        System.out.println("Concat method::"+name1.concat(name2));

        //replace method
        System.out.println("Replace Method::"+name1.replace("am","AM"));

        //Split method
        for(String w:intro.split("\\s",0)){
            System.out.print(w);
        }
        System.out.println();

        //Intern Method
        String str1 = new String("Hello all").intern();
        String str2 = new String("Hello all").intern();
        System.out.print("Are the two strings created strings are equals?");
        System.out.print(str2 == str1);
        System.out.println();

        //Index of
        System.out.println("Index of y::"+name1.indexOf("y"));

        //toLowerCase
        System.out.println("Lower Case::"+name1.toLowerCase());

        //toUpperCase
        System.out.println("Upper case::"+name1.toUpperCase());

        //CodePointAt
        System.out.println("Code Point at::"+name1.codePointAt(0));
        System.out.println("Code Point at::"+name1.codePointAt(1));
        System.out.println("Code Point at::"+name1.codePointAt(2));


        //IgnoreCase
        System.out.println("Ignore Case::"+name1.equalsIgnoreCase(name2));

        //Matches
        System.out.println("Matches Method::"+name1.matches("(.*)yam(.*)"));

        //region Matches
        System.out.println("Region Method::"+name1.regionMatches(0,name2,0,5));

        //GetBytes Method
       byte arr[] = name1.getBytes();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //EndsWithMethod
        System.out.println("Ends with method::"+name1.endsWith("yes"));
        System.out.println("Ends with method::"+name1.endsWith("man"));

        //HashCode
        System.out.println("Hash Code is::"+name1.hashCode());
    }
}

public class StringOperations {
    public static void main(String[] args) {
        StringOps stringOps = new StringOps();
        stringOps.display();
    }
}

//Output-
//
//        Char-at method::a
//        Length method::7
//        String format method::My name is Aryaman
//        Substring method::ya
//        Contains method::true
//        Equals method::true
//        false
//        Is empty method::false
//        Concat method::AryamanAryaman
//        Replace Method::AryAMan
//        IliveinIndore
//        Are the two strings created strings are equals?true
//        Index of y::2
//        Lower Case::aryaman
//        Upper case::ARYAMAN
//        Code Point at::65
//        Code Point at::114
//        Code Point at::121
//        Ignore Case::true
//        Matches Method::true
//        Region Method::true
//        65 114 121 97 109 97 110
//        Ends with method::false
//        Ends with method::true
//        Hash Code is::936663969
