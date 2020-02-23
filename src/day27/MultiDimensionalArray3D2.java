package day27;

import java.util.Arrays;

public class MultiDimensionalArray3D2 {
    public static void main(String[] args) {

        //2D Array contains 1D dimensional array
        int[][] arr2D={{1,2,3},{4,5,6}};

        //3D Array:contains 2D array
        int[][][] arr3D={ {{1,2,3},{4,5,6}} , {{7,8,9},{10,11,12}} };
            //                    0                    1

        //{index num of 2d array] [index num of 1D array] [index num of values]

        //print 9:
        System.out.println(arr3D[1][0][2]);
        //print 2
        System.out.println(arr3D[0][0][1]);
        //print 123
        System.out.println(Arrays.toString(arr3D[0][0]));// returns 1 d array

        System.out.println(Arrays.toString(arr3D[1][1]));

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println( Arrays.deepToString(arr3D));

        for (int i = 0; i <arr3D.length ; i++) {// 2D array
            for (int j = 0; j <arr3D[i].length ; j++) {// each index number of 1d array
                for (int k = 0; k <arr3D[i][j].length ; k++) { // each element
                    System.out.print(arr3D[i][j][k]+" ");
                }
            }

        }

    }
}
