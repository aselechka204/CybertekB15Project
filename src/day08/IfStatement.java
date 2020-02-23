package day08;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int speedLimit = 60;

        int yourCurrentSpeed = 100;

        boolean amISpeeding = (yourCurrentSpeed > speedLimit);


            //if (amISpeeding ) {
        if ( true ) {
                System.out.println("Get pulled over by the police");
            System.out.println("Given ticket by the police");
            System.out.println(" You will get points on the DL");
            System.out.println("Go to Court");

        }else {
                System.out.println("Go Shopping");
                System.out.println("Buy ice cream");

            }
        System.out.println("The End");



    }
}
