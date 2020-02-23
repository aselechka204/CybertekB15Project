package day27;

import java.util.Arrays;

public class MutliDimensionalArrays {
    public static void main(String[] args) {
        // N dimensional array must contain (N-1) dimensional arrays

        // 2 dimensinal array must contain (2-1) dimensional arrays
        //                     0            1            0          1
        String[][] names = {{"Rukhshona", "Ghoya"}, {"Hasan", "Tetiana"}};
        //    index                   0                        1

        //Hasan
        System.out.println(names[1][0]);
        //Tetiana
        names[1][1] = "Dilshat";
        System.out.println(names[1][1]);

        System.out.println(Arrays.toString(names[1]));

        // print all names
        System.out.println(Arrays.deepToString(names));

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < numbers.length; i++) {      // checks each index of two dimensional array
            // System.out.print(Arrays.toString(numbers[i]));

            for (int j = 0; j < numbers[i].length; j++) {// checks each element
                System.out.print(numbers[i][j] + " * ");

            }

        }
        System.out.println("\n==========================");

        int[][] ages = {{10}, {12, 13, 14, 16, 17}, {19, 20, 21, 22, 23}};
        /// index  0           1                 2
        for (int i = 0; i < ages.length; i++) { // get the length
            for (int j = 0; j < ages[i].length; j++) { // get the index
                //  if(ages[i][j]%2!=0){
                //       continue;
                //   }

                if (ages[i][j] % 2 == 0) {
                    System.out.println(ages[i][j] + " ");
                }

            }


        }
        System.out.println("\n==========================");

        int[] arr1D={ 1, 2, 3};

        for (int each:arr1D) {
            System.out.print(each+ " ");

        }
        System.out.println("\n==========================");

        int[][] arr2D={{10, 20, 30},  {40, 50, 60, 70, 80, 90, 100} };
        for (int[] each1DArray:arr2D) {
            for(int eachElement: each1DArray){
                System.out.println(eachElement);


            }

            }

        }


}


