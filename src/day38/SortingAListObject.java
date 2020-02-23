package day38;

import java.util.*;

public class SortingAListObject {
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>(Arrays.asList(300,200,700,600,800));

        System.out.println("nums before sort="+nums);
        //2 ways to sort an ArrayList
        //use collections utility class(just like Arrays utility class for array object)
        // collections is a class coming from java.util package
        //it has a lot of remedy method to work with collection objects like arraylist and so on
        Collections.sort(nums);
        System.out.println("nums after sort="+nums);


        //this version of sort method accepts 2 argument
        //1st is the list to be sorted
        //2nd a comparator object that contains comparing logic
        //good news is ther is ready method already in java
        //we can get reverse order comparator object by calling
        // comparator.reverseOrder(), just take it and use it

        Collections.sort(nums, Comparator.reverseOrder());

        // list itself also has sort method that accept one comparator object
        // simple way to get comparator object are
        //comparator.naturalOrder() -->low to high order
        //comparator.reverseOrder()-->high to low order

        nums.sort(Comparator.naturalOrder());
        System.out.println("nums after using = nums.sort(comparator.naturalorder())+\n"+nums);

        nums.sort(Comparator.reverseOrder());
        System.out.println("nums after using = nums.sort(comparator.reverseOrder())+\n"+nums);


    }
}
