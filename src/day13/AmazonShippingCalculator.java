package day13;

import jdk.swing.interop.SwingInterOpUtils;

public class AmazonShippingCalculator {
    public static void main(String[] args) {
        /*
        Amazon has 2 types of user one is PRIME member and another is regular member
        prime member get free shipping in all purchase no matter the amount
        regular member user get free shipping only if their purchase is more than 25$
        otherwise they get 5$ shipping fee
         */

        String memberType = " Prime Member";
        double amount =15.99d;
        int shippingFee = 0;

        if (memberType.equalsIgnoreCase("PRIME MEMBER")){
            System.out.println("You get 1 day Free Shipping!!!");
            System.out.println("Your final price is "+amount);

        } else if (! memberType.equalsIgnoreCase("PRIME MEMBER") && amount>25) {
            System.out.println("YOU GET 1 DAY FREE SHIPPING");
            System.out.println("your final price is " + amount);
        } else {
            System.out.println("DO YOU WANT TO SIGN UP FOR PRIME MEMBERSHIP?");
            shippingFee = 5;
            amount = amount+shippingFee;// amount += shipping
            System.out.println("YOUR FINAL AMOUNT IS "+ amount);

        }









    }
}
