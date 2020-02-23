package Example;

import java.util.Scanner;

public class Repl34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter price in cents:");

        int itemPrice =scan.nextInt();
        int quarters=(itemPrice/25);
        int dimes=(itemPrice%25)/10;
        int nickels=((itemPrice%25)%10)%5;


        if(itemPrice%5==0 ){
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
        }else if(itemPrice<25 || itemPrice>100){
            System.out.println("Invalid price!");
        }else if(itemPrice%5!=0){
            System.out.println("Invalid price!");
        }


    }
}
