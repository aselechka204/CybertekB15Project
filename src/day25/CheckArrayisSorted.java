package day25;

import java.util.Arrays;

public class CheckArrayisSorted {
    public static void main(String[] args) {
        // int[] nums={13, 31, 8, 5, 21, 2};
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("nums= " + Arrays.toString(nums));
        // i assume the array is already sorted and if its not then i change value of isArray sorted

      //  boolean isSortedAlready = true;

        for (int x = 0; x < nums.length - 1; x++) {
            System.out.println(nums[x] + " " + nums[x + 1]);

            //print item1 is less than item2

            System.out.println("is " + nums[x] + " less than " + nums[x + 1] + " ?" + (nums[x] < nums[x + 1]));

            if (!(nums[x] < nums[x + 1])) {
                System.out.println("Array is not sorted, no point checking the rest");
         //       isSortedAlready=false;

                break;

            }
     //       System.out.println("Is array already sorted="+ isSortedAlready);
        }
    }
}
