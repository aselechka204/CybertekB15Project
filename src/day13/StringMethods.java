package day13;

public class StringMethods {
    public static void main(String[] args) {
        // String actions that we already know so far

        // equals
           String s1 = "Aselya";
        System.out.println( s1.equals("abc"));
        // equalsIgnoreCase

        System.out.println( s1.equalsIgnoreCase("Hello"));

   /// toUpperCase method is String is used to make String all character uppercase
        System.out.println(  s1    );
        System.out.println(  s1.toUpperCase()    );
        System.out.println( s1.toLowerCase());

        // store your name into a variable
        // print your name in all uppercase:
        // you m ay optionally concatenate "MY NAME IS : YOURNAME"
        // print your name in all LOWERCASE:
        // you may optionally concatenate "my name is : yourname"

        String name1 = "AseLiya";
        String name2 = "Aidarbekova";

        System.out.println(name1.toLowerCase()    );
        System.out.println(name2.toUpperCase());
        System.out.println("My name is "+name1 +" "+name2);
        System.out.println( name1.length());

        int lengthOfStr = name1.length();

        if(lengthOfStr >4){
            System.out.println("More than 4 characters");
        } else {
            System.out.println("NOT MORE THAN 4");
        }
    }
}
