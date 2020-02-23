package day16;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        String word1="Java";

        String word2="";

         word2 += word1.charAt(3)+" "+word1.charAt(2)+" "+word1.charAt(1)+" "+word1.charAt(0) ;
         // word2 = word2+ word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0) ;
        // word2 = ""+ word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0) ;
        System.out.println("word 2 = " + word2);


        String msg = "Hello";
        // msg = msg+" World!";
         msg += " World";
        System.out.println("msg= "+ msg);

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter the keyword to search ");
        String keyWordToSearch=scan.nextLine();
        String tabTitle = keyWordToSearch+ "-Google Search";

        if(tabTitle.startsWith(keyWordToSearch) && tabTitle.endsWith("-Google Search")    ){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
    }
}
