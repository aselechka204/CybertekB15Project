package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18") );


        System.out.println("productList="+ productLst);
        System.out.println("productList element count"+ productLst.size());

        String itemDetails="iPhone 6s,449,18.71";

        String[] itemSplitArr=itemDetails.split(",");

        String name= itemSplitArr[0];
        System.out.println("name="+name);

        double pricce= Double.parseDouble(itemSplitArr[1]);  // longer way
        System.out.println("price"+pricce);

        double monthly=Double.parseDouble(itemSplitArr[2]);
        System.out.println("monthly"+monthly);

     ////   System.out.println("item name "+itemDetails.split(",")[0]);  // this is shorter way
     //   System.out.println("item price="+itemDetails.split(",")[1]);
     //   System.out.println("item monthly price"+itemDetails.split(",")[2]);

    }
}
