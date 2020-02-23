package day16;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("GIVE ME FIVE!!!");


        int number = 0;

        while(number !=5){

            System.out.println("Hey You did not give me 5!");
            number=scan.nextInt();
        }

        System.out.println("End of The Program");




    //    int number = scan.nextInt();

   //     if(number !=5){
   //         System.out.println("Hey You did not give me 5!");
   //     }
    //    System.out.println("End of The Program");

    }
}
