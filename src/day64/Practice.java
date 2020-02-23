package day64;


import java.util.*;

public class Practice {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        // Map view:
         // Keyset view, values view , entrySet view
        // how do i store all the keys into a collection
        // what do you think the data type will be to store such collection?
        // set because keys are unique
        // we can use keyset() method of Map to get set of keys
        // this set is strictly connected to original map, map entry with this key will be also removed 
        Set<String> allNames = groceryPriceMap.keySet();
       // System.out.println("allNames = " + allNames);
        //allNames.remove("Tomato");
       // System.out.println("allNames = "+allNames);
      //  System.out.println("groceryPriceMap after = " + groceryPriceMap);
        // what if we do not want such relationship and we just want to use the keys somewhere else?
        // get a copy of the set into different object 
        Set<String>namesCopy = new HashSet<>(allNames);
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryPriceMap= "+groceryPriceMap);

    }
}
