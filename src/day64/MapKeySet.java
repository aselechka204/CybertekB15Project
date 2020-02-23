package day64;


import java.util.*;

public class MapKeySet {
    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        // map is not iterable so we can not directly iterate over them
        // we can get something iterable out of the map
        // for example keyset view will return a set<string> and its iterable

        Set<String>allNames=groceryPriceMap.keySet();

        for (String each:allNames) {
            System.out.print("eachName= "+ each);
            System.out.println("value is "+groceryPriceMap.get(each));
        }
    }
}