package day06;

import java.util.Scanner;

public class RemainderExample {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println(" Please enter minutes as a whole number : ");
        int minutes = scan.nextInt();
        scan.nextLine();


        System.out.println(minutes / 60);
        System.out.println(minutes % 60);

        int total = (minutes / 60);
        int remainder = (minutes % 60);

        System.out.println("The minutes that you entered is " + minutes + " it's " + total +"hours " + " and the remainder is " + remainder);

    }
}
