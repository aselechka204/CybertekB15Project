package day06;

import java.util.Scanner;

public class ShoppingExample {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in) ;

        System.out.println("What is the price of the item?");
        double regularPrice = scan.nextDouble();

        System.out.println("What is the discount precentage?");
        double discount = scan.nextDouble();

        double finalPrice = (regularPrice*discount);
        double total = (regularPrice - finalPrice);

        System.out.println("Based on the information you gave me the final price is "+ total);









    }


}
