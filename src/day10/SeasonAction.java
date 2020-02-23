package day10;

import java.util.Scanner;

public class SeasonAction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey what is the season?!");
            String season = scan.nextLine(); //String season = "Winter";
        switch (season){
            case "Spring" :
             System.out.println("Enjoy Spring Holidays!");
            break ;

            case "Summer" :
                System.out.println("Enjoy Summer Vacation!");
                break ;

            case "Fall" :
                System.out.println("Enjoy Fall Holidays!");
                break ;
            case "Winter":
                System.out.println("Enjoy Winter Holidays!");
                break ;




        }





    }

}
