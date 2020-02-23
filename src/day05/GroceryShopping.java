package day05;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("What is the price of the tomatoes? : ");
        double tomatoes = scan.nextDouble();
        System.out.println("How many tomatoes are you planing on purchasing? : ");
        double tomatoes1 = scan.nextDouble();

        System.out.println("What is the price of the potatoes? : ");
        double potatoes = scan.nextDouble();
        System.out.println("How many potatoes are you planing on purchasing ? :");
        double potatoes1 = scan.nextDouble();
        System.out.println("What is the price of the bananas? : ");
        double bananas = scan.nextDouble();
        System.out.println("How many bananas are you planing on purchasing? : ");
        double bananas1 = scan.nextDouble();

        double tomatoes2 = (tomatoes*tomatoes1);
        double potatoes2 = (potatoes*potatoes1);
        double bananas2 = (bananas*bananas1);
        double total = (tomatoes2+potatoes2+bananas2);


        System.out.println(" Total Purchase Price is "+total);




    }
}
