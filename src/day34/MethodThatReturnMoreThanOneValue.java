package day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {
    public static void main(String[] args) {
        String sentence="I love Java";
        char[] eachChar=sentence.toCharArray();
        String[] eachWords=sentence.split(" ");

     int[] resultArr= returnBoysVsGirlsResult();
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] returnBoysVsGirlsResult(){
       int[]boysGirlsCount={57,57};
        return boysGirlsCount;
    }
}
