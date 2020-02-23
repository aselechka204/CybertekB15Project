package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {

        List<String> groceries= Arrays.asList("Eggs", "Milk", "Butter", "Apple", "Salmon");
        System.out.println("groceries="+ groceries);

        ArrayList<String> newList= new ArrayList<>(groceries);
        newList.add("Diet coke");
        newList.add("Sugar");

        System.out.println("newList="+ newList);

        List<String> newItemsToAdd= Arrays.asList("Pasta", "Branzini", "Asparagus", "Spinach");
        newList.addAll(newItemsToAdd);
        System.out.println("add all="+newList);

        ArrayList<Integer>nums1=new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

        ArrayList<Integer>nums2=new ArrayList<>();
        nums2.add(2000);
        nums2.add(1000);

        nums1.addAll(nums2);
        System.out.println(nums1);
        System.out.println(nums2);


        nums2.addAll(Arrays.asList(100,200,300,400));
        System.out.println("num2 after adding 4 items"+nums2);

        //ArraysAsList will return a list object of all items


    }

}
