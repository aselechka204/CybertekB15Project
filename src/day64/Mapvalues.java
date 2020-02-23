package day64;

import java.util.*;

public class Mapvalues {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        //in order to get all the values in the map and store it to collection
        // we can use values method from the map and it will return
        //a collection object that contains all the value

       Collection<Double> allPrices = groceryPriceMap.values();
        System.out.println("allPrices = " + allPrices);
       allPrices.remove(1.99);
        System.out.println("groceryPriceMap= "+groceryPriceMap);
        //remove method removes whatever comes first

        // if you want no connection you may jsut copy allPrices into different collection object
        //like we did before

        List<Double> pricesCopy= new ArrayList<>(allPrices);






           }
}
