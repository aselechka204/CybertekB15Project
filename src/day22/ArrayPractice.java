package day22;

import jdk.swing.interop.SwingInterOpUtils;

public class ArrayPractice {
    public static void main(String[] args) {

        double [] prices = new double [5];
        System.out.println(prices[0]);

        // cannot print out array variable directly
        // to see whats inside

        System.out.println(prices);
        prices [0]=2.46;
        prices [1]=12.46;
        prices [2]=992.1;
        prices [3]=500;
        prices [4]=65.123;
        // what happen if i go over the range
     //   prices [5]=165.3;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        //create char array that hold al the letter from your name
        // and assign values using each characters of your name.


        char [] name = new char [4];
        // WHAT DEFAULT VALUE WE GET FOR CHAR ARAY
        // WE GET A CHAR REPRESENTED BY ASCII CODE 0
        System.out.println("<"+name+">");
        name[0]='A';
        name[1]='S';
        name[2]='E';
        name[3]='L';

        System.out.println(name[0]);
        System.out.println( name[1]);
        System.out.println( name[2]);
        System.out.println(name[3]);
        System.out.println(name);

        boolean [] bools= new boolean[3];
        System.out.println(bools[0]);
        System.out.println(bools[1]);
        System.out.println(bools[2]);

        bools[0]=true;
        bools[1]=false;
        bools[2]=true;

        System.out.println(bools[0]);
        System.out.println(bools[1]);
        System.out.println(bools[2]);





    }
}
