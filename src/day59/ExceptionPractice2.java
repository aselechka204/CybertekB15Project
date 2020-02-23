package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {
    public static void main(String[] args) {

        String name= "Furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkans name?");

        //we want to take difference action according to
        //different type of exception happen during the program


        try {
            int targetIndex= scan.nextInt();
            System.out.println(name.charAt(targetIndex));
            System.out.println("end of try");
            // }catch(Exception e) {
        }catch(StringIndexOutOfBoundsException e){
            //   e.getMessage() is a message coming from exception class and provide some more details about exception object
       //     System.out.println("Message from getMessage method: "+e.getMessage());
            System.out.println("You are out of bound");
            System.out.println("Enter between 0 and "+name.length());

        } catch(InputMismatchException bla) {

            System.out.println("input mismatch, enter number");
        }

        System.out.println("the end");
    }
}
