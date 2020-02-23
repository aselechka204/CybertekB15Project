package day24;

import java.util.Arrays;

public class ArrayClassMethod {
    public static void main(String[] args) {
        // array class a class coming from java.util package
        // it has a lot of pre built method to work with array object

        // for printing the content of the array
        //toString --> arrays.toString(yourArrayhere)
        //for sorting an array in ascending order
        // sort -->> arrays.sort(yourArrayHere)

        //for checking for equality of 2 array object content
        //equals---> arrays.equals(firstarray, secondarray)

        String[] superHeros={"Superman", "Batman","Wonder Woman","Aquaman ","Cyborg "," Flash"};
     //   System.out.println(superHeros);
        System.out.println("Arrays.toString(SuperHeros) result ");
        System.out.println  (Arrays.toString(superHeros));

        String savingSuperHerosAsString= Arrays.toString(superHeros);
        System.out.println("superHerosAsString");
        System.out.println(savingSuperHerosAsString);

        // how do we get first character of superherosasstring variable
        System.out.println("savingSuperHerosAsString.charAt(0) result:" );
        System.out.println(savingSuperHerosAsString.charAt(0) );

        int[]numbers={10,44,55,3,78};
        System.out.println("Arrays.toString(numbers) result");
        System.out.println(Arrays.toString(numbers));

        double[]value={2.99,5.99,6.99};
        System.out.println(Arrays.toString(value));
        String pricesString= Arrays.toString(value);
        System.out.println(pricesString);


        for (int i = 0; i <pricesString.length() ; i++) {
            System.out.println(i+ pricesString.charAt(i));
            System.out.println(pricesString.charAt(1));
        }


    }
}
