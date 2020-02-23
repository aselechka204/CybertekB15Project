package day07;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name, last name , company seperated by space : ");

        String first = scan.next();     //"Asel";
        String last = scan.next(); //  "Aidar";
         String company = scan.next();  //"apple";
         String  email = first +" "+ last+"@"+ company+ ".com" ;

        System.out.println("My name is "+ first + " "+ last +" and i work for "+ company+" and my email address is:" + email);
    }
}
