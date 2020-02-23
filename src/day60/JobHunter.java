package day60;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JobHunter {

    public static void main(String[] args) {


        List<Job> lst= new LinkedList<>();

        Job b1= new Job("Texas", 130000,"Amazon");
        lst.add(b1);
        Job b2= new Job("Texas", 120000,"Apple");
        lst.add(b2);

        Job b3= new Job("Texas", 128000,"Google");
        lst.add(b3);

        Job b4= new Job("Texas", 135000,"Facebook");
        lst.add(b4);

        Job b5= new Job("Texas", 125000,"Chase");
        lst.add(b5);


        //how does the sort method know how to sort?
        //it use the comparing logic provided inside
        //compareto job other method
        //then sort them accordingly

        System.out.println("lst="+lst);

        Collections.sort(lst);

        System.out.println("lst="+lst);

        // whats the difference between collections.reverseOrder()
        //and comparator.reverseOrder();
        //both of them will give you an comparator object with reversed logic
        //



    }
}
