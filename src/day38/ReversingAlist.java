package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingAlist {
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>(Arrays.asList(200,100,700,400,500));

        //after reversing: 500,400,700,100,200

        //after sorting in reverse order line 15
        //700,500,400,200,100
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums reversing = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("nums REVERSE order= " + nums);
        
        
    }
}
