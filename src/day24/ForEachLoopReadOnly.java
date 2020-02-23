package day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {
        int yourFaveNumber = 300;
        int myFaveNumber = yourFaveNumber;

        myFaveNumber = 299;
        System.out.println(yourFaveNumber);

        long[] nums = {10, 40, 20};
      //  nums[0] = nums[0] * 2; // num[0]*=2
    //    System.out.println(nums[0] * 2);

      //  for (int x = 0; x < 3; x++) {
    //        long eachItem= nums[x];
      //     eachItem=100;
           // nums[x] = nums[x] * 2;


        //    for (long eachItem :nums) {
        //        eachItem=100;
            }

        }
     //   System.out.println("After we modify the value");
     //   for (int i = 0; i < 3; i++) {
     //       System.out.println(nums[i]);





