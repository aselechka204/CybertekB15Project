package day49;

import jdk.swing.interop.SwingInterOpUtils;

public interface Juicy {

    public abstract void melting();


    // another type of method interface can have is :
    // static method, it must have a body
    // and its there to provide some utility methods
    //that does not belong to any class
    //static methods of interface are not inherited !!!!
    //it must have a body
    public static void squeeze() {

        System.out.println("static squeezing");
    }
}