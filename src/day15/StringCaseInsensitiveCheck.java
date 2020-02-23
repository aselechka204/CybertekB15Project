package day15;

import jdk.swing.interop.SwingInterOpUtils;

public class StringCaseInsensitiveCheck {
    public static void main(String[] args) {
        String name = "Arya Stark";

        System.out.println(name.contains("st"));
/// i want to check whether this name contains ST no matter the case
        // so i want to store the uppercase version of this name then check for st

        String upper = name.toUpperCase(); // ARYA STARK

        System.out.println(" uppercaseName contains ST vor NOT"+upper.contains("ST"));

        String lower = name.toLowerCase();
        System.out.println(" to lower case "+lower.contains("st"));

        // method chain ... combining multiple method call
        // make my name all lowercase then check whether it contains lowercase ST

//
        System.out.println( name.toLowerCase().contains("st"));
     //   System.out.println(name.length().toUppercase()  ); BAD IDEA

    }
}
