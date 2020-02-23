package day18;

import java.util.Scanner;

public class GiveMe5$20$ {
    public static void main(String[] args) {

        // ; semi colon
        // :colon
        // % remainder operator
        //| pipe
        // &ampersand
        // / forward slash
        // \ back slash



        Scanner scan = new Scanner(System.in);

        System.out.println("give me 5 or 20");

     int x = scan.nextInt();
          //(x==5 || x==20)
     while( x!=5 && x!=20){
         System.out.println("NOT THE BILL I AM LOOKING FOR");
         x=scan.nextInt(); // to keep asking for the answer

     }
        System.out.println("THE HAPPY ENDING !!! GOT THE MONEY");




    }
}
