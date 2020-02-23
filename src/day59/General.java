package day59;

import java.util.concurrent.Callable;

public class General {
    public static void main(String[] args) {

        Object o= new String ("abc");
        // can i get the first char using o
       // System.out.println(o.charAt(0));

        System.out.println("The Start");
    //    String str = null;
        String str="";

        // if you have multi try catch block
        //the most specific type (child type) should come first
        //the more generic type(super type) should come last


        try {
            System.out.println(str.charAt(0));
            System.out.println("End of Try");

        } catch(NullPointerException e){
            System.out.println("No object here!!!");

        } catch(Exception abc){
            System.out.println(abc.getMessage());
            System.out.println("Ths is the rest of the exception");

        }

        System.out.println("The End");

        //Control + Alt+T to get the commands



    }
}
