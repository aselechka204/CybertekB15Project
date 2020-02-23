package day29;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumber {
    public static void main(String[] args) {
        int[] numbers=new int[100];
        System.out.println(Arrays.toString(numbers));
        numbers[0]=0;
        numbers[1]=2;  // 1*2
        numbers[2]=4; //  2*2
        numbers[3]=6;//   3*2
        numbers[4]=8;//   4*2
        numbers[5]=10; // 5*2
        //.....
        numbers[99]=198; //99*2

     // numbers[x]=x*2
        System.out.println(Arrays.toString(numbers));
        for (int x = 0; x <numbers.length ; x++) {
            numbers[x]=x*2;


        }
        System.out.println(Arrays.toString(numbers));




    }
}
