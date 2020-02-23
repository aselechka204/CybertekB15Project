package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySet {
    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);


        //map is not iterable
        //in order to iterate over map, we need to get something iterable like set
        // map store key value pair as entry iternaly
        //and we can get this Entries out using entryset() view
        //so we can perform operation on keyvalue pair together

        Set<Map.Entry<String, Double>> entryView = groceryPriceMap.entrySet();

        for( Map.Entry<String, Double> each : entryView ){
            System.out.println(" Key for current entry is "+each.getKey());
            System.out.println(" Value for current entry is "+each.getValue());
            //update the value of the grocery if the grocery name has exact 5 characters

            if(each.getKey().length()==5){

                each.setValue(15.0);
            }

        }

        System.out.println("grocerypricemap ="+groceryPriceMap);
    }
}