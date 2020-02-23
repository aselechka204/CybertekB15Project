package day12;

import java.util.Scanner;
public class SeasonString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season:");
        String season = scan.next();

        if(season.equalsIgnoreCase("Spring")){
            System.out.println("Allergy Season");
        } else if(season.equalsIgnoreCase("Summer")){
            System.out.println("Beach Season");
        }else if(season.equalsIgnoreCase("Fall")){
            System.out.println("Thanksgiving Holiday");
        } else if(season.equalsIgnoreCase("Winter")){
            System.out.println("Christmas Holiday");
        } else if(season.equalsIgnoreCase("Wrong Season")){
            System.out.println("Wrong Season Selection");
        }




    }
}
