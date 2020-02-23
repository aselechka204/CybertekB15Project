package day24;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {
        int[] scores={99,44,66,23,19,55};
        System.out.println(Arrays.toString(scores));
        System.out.println("original first item value "+scores[0]);
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("first item value: "+scores[0]);

        char[] nameChars={'G',' ', '9', 'Z','d','A'};
        System.out.println("before sorting nameChars: "+ Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting nameChars:"+Arrays.toString(nameChars));

        String[] superHeros={"Superman", "Batman","Wonder Woman","Aquaman ","Cyborg ","Flash"};

        System.out.println(Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println(Arrays.toString(superHeros));
    }
}
