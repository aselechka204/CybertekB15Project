package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers=new int[5];
        System.out.println(Arrays.toString(numbers));
        Scanner scan=new Scanner(System.in);

 //       System.out.println("Enter an int number: ");
   //    int input= scan.nextInt();
   //    numbers[0]=input;

       for(int i=0; i < 5; i++) {

           System.out.println("Enter an int number: ");
        //   int input1 = scan.nextInt();
           numbers[i] = scan.nextInt();
       }
        System.out.println(Arrays.toString(numbers));

       //Arrays.sort(variableName):sorts the array in ascending order
        Arrays.sort(numbers);
        int largestNumber=numbers[numbers.length-1];
        int minNumber=numbers[0];
        System.out.println("Largest number is "+ largestNumber);
        System.out.println("Minimum number is "+minNumber);
    }
}
