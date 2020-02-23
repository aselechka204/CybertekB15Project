package day08;

import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("GUESS MY FAVORITE NUMBER : ");
        int myFavoriteNumber = scan.nextInt();

        if (myFavoriteNumber == 300){
            System.out.println("BINGO!!!");
        } else {
            System.out.println("YOU ARE NOT MY BEST FRIEND, TRY AGAIN");
        }







    }
}
