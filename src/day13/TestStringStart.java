package day13;

import jdk.swing.interop.SwingInterOpUtils;

public class TestStringStart {
    public static void main(String[] args) {
        String name = "Muge";

        // check if a String starts with another String
        //IT IS CASE SENSITIVE
        System.out.println(name.startsWith("Mu"));
        System.out.println(name.startsWith("Mac"));
        // check if a String end with another string
        System.out.println(name.endsWith("Ku"));
        System.out.println(name.endsWith("ge"));
    }
}
