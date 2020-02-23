package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPricaticeWithLoop {
    public static void main(String[] args) {

        List<Integer>nums=new ArrayList<>();
        for (int number = 1; number <=100 ; number++) {
         //   System.out.println("x= "+x);
            nums.add(number);
        }
        System.out.println("nums = "+nums);

        // change all the odd number value to 0;

        for (int i = 0; i <nums.size() ; i+=2) {
            System.out.println("odd values are at index="+i);
            nums.set(i,0);
        }
        System.out.println("nums with odd numbers as 0 "+nums);

        // insert 100 to first index:

        nums.add(0,100);
        System.out.println(nums);

        List<Integer>lst2=new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("lst2="+lst2);
        // insert 100 right after 34: we do not know where is 34:


          int locationOf34Value=lst2.indexOf(34);
        lst2.add(locationOf34Value+1,100);

      //  lst2.add(lst2.indexOf(34)+1,100);

        System.out.println("lst2="+lst2);


        // add five 100 in front of 44

        //output-->lst2={100,100,100,100,100,44,14,34,100

      //lst2.add(lst2.indexOf(44)+1,100);


        for (int i = 0; i <=5 ; i++) {
            lst2.add(0,100);

        }
        System.out.println(lst2);
    }

}
