package day05;

import java.util.Scanner;


public class PracticeScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Are you recording? : ");


        boolean isRecording = input.nextBoolean();

        System.out.println("So your answear is "+ isRecording);



    }
}
