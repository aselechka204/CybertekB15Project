package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice {
    public static void main(String[] args) {

        List<Double> prices= Arrays.asList(9.99, 5.55, 3.76, 8.99, 0.99, 65.67);

        int count= 0;

        for(Double each : prices){
            if(each>5){
                ++count;
            }
        }
        System.out.println("count= "+count);

        ArrayList<Double>newPrices=new ArrayList<>(prices);
        newPrices.add(199.99);
        newPrices.remove(0.99);
        System.out.println("new prices="+ newPrices);

        // create a arraylist object in one short with many items so we can add or remove

        ArrayList<Double> oneShotPrice=new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76, 8.99));

        oneShotPrice.add(1, 100.99);
        oneShotPrice.remove(2);
        System.out.println("oneShotPrice="+oneShotPrice);
    }
}
