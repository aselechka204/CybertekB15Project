package day33;

import java.util.Scanner;


public class ReturnWillTerminateTheMethod {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number more than 10");

        int num=scan.nextInt();
        if(num<10){
            return;
        }

        System.out.println("Happy Holidays");
        System.out.println("2 days off!! yay");
    }
}
