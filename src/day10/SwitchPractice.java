package day10;

import jdk.swing.interop.SwingInterOpUtils;

public class SwitchPractice {
    public static void main(String[] args) {
        String order = "";
        int itemNumber = 11;
                // what data type of variable i can use here ? byte short int char string
        switch ( itemNumber) {
            case 11:
                System.out.println("You have selected 11");
                order = "Burger";
                break; // if break doesn't show up here than it will move on to the next case.
            case 5:
                System.out.println("You have selected 5");
                order = "French Fries";
                break;
            case 8:
                System.out.println(" You have selected 8");
                order = "Nuggets";
                break;
            case 35:
                System.out.println("You have selected 35");
                order = "ICE CREAM";
                System.out.println("ENJOY");
                break;
            default:
                System.out.println("You have selected UKNOWN NUMBER");
                order = "unknown";
                break;
        }
                System.out.println("Your order is " + order);


    }
}
