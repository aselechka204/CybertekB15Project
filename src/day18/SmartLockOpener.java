package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        // smart lock door has password
        // unless you enter correct password
        // it keeps locking you out
        // assuming correct password os B15

        Scanner scan = new Scanner(System.in);
        System.out.println("Knock Knock!!");
        System.out.println("What is your password?");

        String password =scan.next();

        while (! password.equals("B15")){
            System.out.println("Wrong Password , Try again");
            password=scan.next();
        }
        System.out.println("Open Seseame");

    }
}
