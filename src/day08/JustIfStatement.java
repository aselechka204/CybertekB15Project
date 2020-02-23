package day08;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current speed, dear driver?:");

        int currentSpeed = scan.nextInt();

        System.out.println("What is the speed limit?");
        int speedLimit = scan.nextInt();
        if ( currentSpeed >= speedLimit) {
            System.out.println("Get pulled over by the police");
            System.out.println("Given ticket by the police");
            System.out.println(" You will get points on the DL");
            System.out.println("Go to Court");

        }

        System.out.println("The end of the story!!!");
    }
}
