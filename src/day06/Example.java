package day06;


import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? :");
        String name = scan.nextLine();

        System.out.println(" What state and city do you live in ? : ");
        String state = scan.nextLine();


        System.out.println("What is the street name that you live on? :");
        String street = scan.nextLine();



        System.out.println(" Your name is " + name + ". Your state and city: " +state + ". Your street name is " + street);

    }

}
