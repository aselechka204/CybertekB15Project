package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemovalItemPractice {
    public static void main(String[] args) {

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(2);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("lst="+ lst2);

      //  lst2.remove(3);
      //  lst2.remove(2);                  // removing item by its index
      //  lst2.remove(new Integer(2)); // removing item by its value rather than index
          lst2.remove(Integer.valueOf(2));

        System.out.println("lst ="+ lst2);
    }
}
