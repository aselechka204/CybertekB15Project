package day36;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        //Create ArrayList object of long and assign it to a variable

        ArrayList<Long> last=new ArrayList<>();

        // add item, insert an item, read item, update the item, remove the item, check the location...

        last.add(12L);
        last.add(100L);
        last.add(150L);
        last.add(200L);

        System.out.println("list= "+ last);


        //counting items inside Array
        System.out.println("Counting items using last.size()= "+last.size());

        // getting items inside ArrayList object
        System.out.println("last.get(0) = " + last.get(0));


        // get the sum of above ArrayList item

          long sum= 0;
        for (int i = 0; i < last.size() ; i++) {
            System.out.println("item "+ last.get(i));
            }

        for (int i = 0; i < last.size() ; i++) {
            sum= sum+last.get(i);
        }
        System.out.println("sum "+sum);

        long max=last.get(0);
        for (int i = 0; i < last.size() ; i++) {

      if(last.get(i)>max){
          max=last.get(i);
      }

        }
        System.out.println();
        }
    }

