package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
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

        for(String each : productLst){
            String namePart= each.split(",")[0];
            System.out.println("eachProduct name ="+namePart);


            for (int i = 0; i <productLst.size() ; i++) {
                System.out.println(productLst.get(i).split(",")[0]);
                System.out.println("each product name="+namePart);
            }


            for(String eachProduct : productLst){

                double price=Double.parseDouble(eachProduct.split(",")[1]);


                if(price>500){
                    System.out.println("price="+price);

                }
            }

            double sum= 0;
            double average= 0;

            for(String eachProduct : productLst) {

                double price = Double.parseDouble(eachProduct.split(",")[1]);
                sum = sum + price;
            }
            average= sum/productLst.size();
            System.out.println("sum= "+sum);
            System.out.println("average= "+average);


            for(String eachProduct: productLst){
                 String name= eachProduct.split(",")[0];
                 double monthly= Double.parseDouble(eachProduct.split(",")[2]);

                 if(monthly<20){
                     System.out.println(name+" $" +monthly);
                 }

                System.out.println(productLst.contains("Dyson"));//false
                System.out.println(productLst.contains("Dyson"));//-1

                int dysonIndex=0;
                for (int x = 0; x <productLst.size() ; x++) {
                    if(productLst.get(x).startsWith("Dyson")){
                        dysonIndex=x;
                    }
                }
                System.out.println("dysonIndex "+dysonIndex);
                String dysonDetails=productLst.get(dysonIndex);
                String priceStr=dysonDetails.split(",")[1];
               double price=Double.parseDouble(dysonDetails.split(",")[1]);


            }

            }


    }
}
