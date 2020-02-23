package day18;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class SmartLockDoWhileVersionJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Knock Knock!!");
        String password;

        do{
            System.out.println("Whats the password?");
            password = scan.next();
        }while(!password.equals("B15"));
        System.out.println("Door is Open!!!");




    }
}
