package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Iterator {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

      // optional Lamda
    //    groceryPriceMap.forEach(name,price)->System.out.println("name= "+name+" price ="+price));
    }
}