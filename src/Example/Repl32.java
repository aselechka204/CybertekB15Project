package Example;

import java.util.Scanner;

public class Repl32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter seconds:");
        int inputSeconds = scan.nextInt();


        int hours = inputSeconds/3600;
        int minutes = inputSeconds%60;
        int seconds = minutes%60;
        minutes=minutes%60;


        System.out.println( hours+" hours, "+minutes+" minutes, and "+seconds + " seconds");
    }
}
