package day08;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Voting Eligibility Program
        Create a variable called age as int
        check weather this age is more than 18
        if yes print: you are ready to vote!!
        if its less 18 print wait until you are 18
         */

        /*
        Create a program to guess your favorite number
        crate a variable called Myfavor

         */

        int age = 27;

        System.out.println(age >=18);

        if (age >= 18) {
            System.out.println("You are eligible to vote");

        } else {
            System.out.println("Wait until you are 18");


        }
    }
}