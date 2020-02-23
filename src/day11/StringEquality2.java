package day11;

import java.util.Scanner;

public class StringEquality2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "Rabia"; // String literal

        String name2 = new String ("Rabia");

        String name3 = "Rabia";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println( name==name2);
        System.out.println(name==name3);

     // The correct way of comparing String to get consistent result is
        // using one of the String object behaviour / method called
        // equals method
        // str1.equals(str2)
        System.out.println("USING EQUALS METHODS");
        System.out.println( name.equals(name2));
        System.out.println( name.equals( name3));

    }
}
