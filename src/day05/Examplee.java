package day05;

import java.util.Scanner;

public class Examplee {


    public static void main(String[] args) {

        //To ask user for day
        // generate minute that day have

        Scanner scan = new Scanner(System.in);

        System.out.println("How many days are in a week ? : ");


        int day = scan.nextInt();

        double minutes = ( day*1440);

        System.out.println("Do you know that it's " + minutes + "minutes");








    }


}
