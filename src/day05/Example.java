package day05;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);


        System.out.println("What is the temprature in F ? ");

        double fahre = scan.nextDouble();

        double celsius = (5.0 / 9)*(fahre - 32);

        System.out.println(" fahrenheit " +fahre + " is " + celsius + "in celsius" );


    }
}
