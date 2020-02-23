package day36;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<Long>lst=new ArrayList<>();


        lst.add(12L);
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        lst.add(null);
        System.out.println("lst= "+lst);
        lst.add(2, 125L);
        System.out.println("lst= "+lst);

        System.out.println("lst.get(3)= "+lst.get(3));

        //update value at certain index
        lst.set(3,195L);
        System.out.println("New Value for lst.get(3)="+lst.get(3));
        System.out.println("lst= "+lst);

        //removing item by value

     //   lst.remove(100L);
    //    System.out.println("lst after removing 100= "+lst);


        //remove item by index
        lst.remove(2);
        System.out.println("lst after removing item at index 2= \n\t"+ lst);

        System.out.println("Location of 100L is using lst.indexOf(100L)="+lst.indexOf(100L));

        System.out.println("Location of 23L is using lst.indexOf(23L)= "+lst.indexOf(23L));

        System.out.println("lst.size()>0="+(lst.size()>0));
        System.out.println("\nlst.isEmpty()="+lst.isEmpty());

      //  lst.clear();
     //   System.out.println("after clearing isEmpty()="+lst.isEmpty());

        /*
        hi Aselechka!!!
         */

        System.out.println("Location of 100L is using lst.indexOf(100L)="+lst.contains(100L));

        System.out.println("do i have 10L "+(lst.indexOf(10L)!=-1));


    }
}
