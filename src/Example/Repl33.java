package Example;

import java.util.Scanner;

public class Repl33 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of milligrams: ");

        int milligrams = scan.nextInt();
        int grams = 1000/milligrams;

        System.out.println("It would take about 20 drinks for a lethal overdose."+grams);



    }
}
