package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllMethodPractice {
    public static void main(String[] args) {

        ArrayList<Integer> nums1=new ArrayList<>();
        nums1.add(100);
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);
        nums1.add(500);
        nums1.add(600);

        System.out.println("nums"+nums1);
        nums1.removeAll(Arrays.asList(100,300));

        System.out.println("after removing"+nums1);
    }
}
