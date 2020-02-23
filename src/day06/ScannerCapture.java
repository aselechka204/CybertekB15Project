package day06;

import java.util.Scanner;

public class ScannerCapture {

    public static void main(String[] args) {
        Scanner asela = new Scanner(System.in);

        System.out.println("What is your name?: ");
        String name = asela.next();
       // String anotherWord = asela.next();

        int age = asela.nextInt();


        System.out.println("You have entered : " + name);
        System.out.println("What ia your age " + age);


    }
}
