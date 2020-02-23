package day07;

import jdk.swing.interop.SwingInterOpUtils;

public class CastingTheCharacter {
    public static void main(String[] args) {


        char grade = 'B';
        System.out.println(grade);

        int letterInNumber = 'B'; // B is represented by 66 acii table
        // here type char is automatically widened to int
        // and stored as number
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        char myFirstChar = 100;
        System.out.println(myFirstChar);

        // find out your number of each character in your first name

        int myName = 'A';
        int myName2 = 'S';
        int myName3 = 'E';
        int myName4 = 'L';

        System.out.println(myName);
        System.out.println(myName2);
        System.out.println(myName3);
        System.out.println(myName4);
        System.out.println(myName+myName2+myName3+myName4);

        char letterA = 'a';
        // adding charact rto a int number will result in int
        //
        System.out.println(letterA+ 1 );
        System.out.println(" "+ letterA + 1 );





    }
}
