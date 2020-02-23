package day22;

import java.util.Scanner;

public class ScannerLoop {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int[] numbers=new int[10];

        for (int x = 0; x <numbers.length ; x++) {
            System.out.println("Enter your number "+(x+1));

            numbers[x]=scan.nextInt();

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+" 1" +" ");

        }

    }
}
