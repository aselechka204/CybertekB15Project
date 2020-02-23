package day59;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {

        String name= "Furkan";

      //  System.out.println("number 100 char of his name is "+name.charAt(100));

      //  StringIndexOutOfBoundsException e1= new StringIndexOutOfBoundsException();

     //   System.out.println(e1.toString());

        //exceptions are objects so it has its own class
        // and we can creat object ourselves just like we did from any other classes

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkans name?");

        int targetIndex= scan.nextInt();
        try {
            System.out.println(name.charAt(targetIndex));
            // }catch(Exception e) {
        }catch(StringIndexOutOfBoundsException e){
         //   e.getMessage() is a message coming from exception class and provide some more details about exception object
            System.out.println("Message from getMessage method: "+e.getMessage());

            System.out.println("Something unusual happen");
        }

            System.out.println("the end");

    }
}
