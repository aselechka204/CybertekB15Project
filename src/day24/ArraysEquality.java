package day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {

        int[] scores1 = {2, 5, 6, 7, 3, 34, 6};
        int[] scores2 = {22, 45, 6, 37, 3, 6, 9};
        int[] scores3 = {2, 5, 6, 7, 3, 34, 6};
        int[] scores4 = {2, 6, 6, 5, 2, 34, 7};

        System.out.println(scores1 == scores2);
        System.out.println(scores1 == scores3);

        boolean s1s2Equals= Arrays.equals(scores1,scores2);
        System.out.println("is Score1 has same content as Score2 "+ s1s2Equals);

        boolean s1s3Equals= Arrays.equals(scores1,scores3);
        System.out.println("is Score1 has same content as Score2"+ s1s3Equals);

        Arrays.sort(scores3);
        Arrays.sort(scores4);
        boolean s3s4Equals= Arrays.equals(scores3,scores4);
        System.out.println(s3s4Equals);

    }
}