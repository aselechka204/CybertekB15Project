package day37;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Double> priceList=new ArrayList<>();

        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList="+priceList);


        //change 3rd price to $10
        //      index 2 , price 10
        priceList.set(2,10.0);
        System.out.println("third item new price="+priceList.get(2));
        System.out.println("list with the new priceList (10$ added)"+ priceList);


        //Add 4 dollar to first price

        priceList.set(0, priceList.get(0)+4);
        System.out.println("added 4$ to the existing value of 9.99$"+priceList);

        // change last price to sum of first and second price

        double sumOfFirst2Items= priceList.get(0)+priceList.get(1);
        priceList.set(priceList.size()-1, sumOfFirst2Items);
        System.out.println("New PriceList="+priceList);


        // give 40% off to second price
       priceList.set(1, priceList.get(1)*0.6);
        System.out.println("After 40% off second item value is"+ priceList.get(1));
        
        // double the value of each and every price in the list:
        //this is how we do it for one, now we do it for all of them by replacing the index with variable
       //   priceList.set(0,  priceList.get(0)*2);  //in order to update the item we need an index and new value
        // in order to update the first value index will be 0
        //in order to double the price from the original, first we need to get the original value
        //then multiply by 2 and use that value for 2nd parameter of set method
      //    double newValue= priceList.get(0)*2;
       //   priceList.set(0, newValue);

        for (int x = 0; x < priceList.size(); x++) {
            double newVal=priceList.get(x)*2;
            priceList.set(x, newVal);
        }
        System.out.println("price list after doubling="+ priceList);

        // cut the price into half if the price is more than 20$

        for (int x = 0; x <priceList.size() ; x++) {
            double eachPrice= priceList.get(x);

            if(eachPrice>=20){
                priceList.set(x,eachPrice/2);
            }
        }
        System.out.println("priceList after cutting half the prices more than 20="+"\n\t"+priceList);

        //swap the first value with the last value
        int lastIndex= priceList.size()-1;
        Double temp= priceList.get(0);
        priceList.set(0,priceList.get(lastIndex));
        priceList.set(lastIndex,temp);

        System.out.println("price list after swapping first and last value:"+ "\n\t"+priceList);
    }
}
