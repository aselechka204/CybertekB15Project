package day25;

import java.util.Arrays;

public class day25 {
    public static void main(String[] args) {

         int [] nums= {13, 31, 8, 5, 21, 2};
        System.out.println("nums = "+ Arrays.toString(nums));

        int numsItemCount=nums.length;
        int [] numsCopy=new int [numsItemCount];


        for (int x = 0; x <numsItemCount ; x++) {
            numsCopy[x]=nums[x];


        }

        System.out.println("Before sort numsCopy="+ Arrays.toString(numsCopy));
        Arrays.sort(numsCopy);
        System.out.println("After sort numsCopy= "+ Arrays.toString(numsCopy));


        if(Arrays.equals(nums, numsCopy)){
            System.out.println("This array is already sorted");
        }else{
            System.out.println("This array not already sorted");
        }
    }
}
