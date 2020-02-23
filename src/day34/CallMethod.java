package day34;

import day31.Calculator2;

import java.util.Arrays;

public class CallMethod {
    public static void main(String[] args) {


        int result1 =WarmUp.build3DigitNumber(6, 4, 0);
        System.out.println("result1 = " + result1);

        int[] nums={2,5,87};
        System.out.println("Arrays.toString(nums) "+ Arrays.toString(nums));
// how can i call static method called calculate in calculator under 31
        // so we need to import the class-->> import day31.calculator_V2

        Calculator2.calculator(10,20,'-');





    }
}
