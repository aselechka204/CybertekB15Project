package day05;

import java.util.Scanner;

public class Practicetask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your hourly salary ? :");

        double salary = scan.nextDouble();


        double yearlySalary = (salary*2080);


        System.out.println("Does your yearly salary comes out to" + yearlySalary);

    }
}
