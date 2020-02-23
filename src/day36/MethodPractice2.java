package day36;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {
     long[] myLongs={6L, 11L, 44L, 32L, 65L};
     // one thing primitive variablle cannot do is
        // we cannot assign it to null
        //any non primitive variables can  assigned to null value
        // to define , its not point int to any object yet

        System.out.println("Before swamp(myLongs) = " + Arrays.toString(myLongs));

        swampFirstAndLastValue(myLongs);

        System.out.println("After swamp myLongs = " +Arrays.toString( myLongs));

        long[] muNums1=new long[5];
        System.out.println("Arrays.toString(muNums1) = " + Arrays.toString(muNums1));

        String[] names= new String[5];
        System.out.println("names = " + Arrays.toString(names));

        Long[] myNums2=new Long[5];
        System.out.println("myNums2 = " +Arrays.toString(myNums2));

    }

    public static void swampFirstAndLastValue(long[] nums){

        // nums[0], nums[ nums.length-1]


        long temp= nums[0];             // putting tea in the teacup to temp cup
        nums[0]=nums[nums.length-1];    //putting coffee into tea cup
        nums[nums.length-1]=temp;       // putting tea(in temp cup) into coffee cup
    }
}
