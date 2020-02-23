package day27;

import java.util.Arrays;

public class MultiDimentional {
    public static void main(String[] args) {
   int[] arr1D={1, 2, 3};
        ///2D array: is an array that contains single dimentional arrays
          //            0  1  2    0  1  2
        int[][] arr2D={{1, 2, 3}, {4, 5, 6}};
        // index          0          1

        System.out.println(arr2D.length+ " number of arrays");
        System.out.println(Arrays.toString(arr2D[0])+ " first part array");
        System.out.println(Arrays.toString(arr2D[1])+" second part array");


        // arr2D[0][2]==>3
        System.out.println(arr2D[0][2]);

        System.out.println(arr2D[1][1]);
        System.out.println(Arrays.toString(arr2D[1]));// converting single method, is only applicable
//      Arrays.deepToString(multi-D Arrays):
        System.out.println(Arrays.deepToString(arr2D));


    }
}
