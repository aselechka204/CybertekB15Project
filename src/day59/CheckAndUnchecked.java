package day59;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;

public class CheckAndUnchecked {
    public static void main(String[] args) {

        String x= "abc";
    //    System.out.println(x.charAt(100));


        //exception hiearchy
        //Throwable ----child class Exception ----Errors

        try {
            throw new IOException("JUST THROWING THIS AWAY");
        } catch (IOException e) {
            System.out.println("exception caught");
        }
    }
}
