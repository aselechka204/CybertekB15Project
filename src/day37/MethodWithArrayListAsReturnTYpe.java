package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnTYpe {
    public static void main(String[] args) {

        System.out.println(getListFrom1ToFinalNumber(7));
        System.out.println(getListFrom1ToFinalNumber(2));
        System.out.println(getListFrom1ToFinalNumber(20));

        List<Integer> blahblah= getListFrom1ToFinalNumber(25);
        System.out.println("blahblah" + blahblah);

    }
    public static List<Integer> getListFrom1ToFinalNumber(int finalNumber){
        List<Integer>nums=new ArrayList<>();
        for (int number = 1; number <=finalNumber  ; number++) {
            nums.add(number);
        }
       //  System.out.println("nums ="+ nums);
        return nums;
    }
}
