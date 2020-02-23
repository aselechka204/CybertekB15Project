package day25;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {

        String name = "Anastasiya";

        char[] name2= name.toCharArray();
        System.out.println("Before sorting"+Arrays.toString(name2));



        for (  char eachChar    : name2        ) {
            System.out.println("each character ="+ eachChar);

        }

     // now count how many we have

        int count = 0;
        for ( char eachChar : name2){
            if(eachChar=='a'){
                ++count;
            }

        }

        System.out.println("count "+ count );
        Arrays.sort(name2);

        System.out.println("After sorting"+Arrays.toString(name2));

    }
}