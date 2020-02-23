package day40;

import java.sql.Array;
import java.util.ArrayList;

public class HotMarketActions2Part {
    public static void main(String[] args) {

        Offer1Part o1= new Offer1Part();
        o1.company = "Apple";
        o1.location= "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();

        Offer1Part o2= new Offer1Part();
        o2.company = "Google";
        o2.location= "Boston";
        o2.isFullTime = true;
        o2.salary = 10000;
        o2.displayInformation();

        Offer1Part o3= new Offer1Part();
        o3.company = "Amazon";
        o3.location= "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;
        o3.displayInformation();

        Offer1Part o4= new Offer1Part();
        //if we dont assign values for instance field|variable
        //we get default value
        //for primitive numbers :0 or 0.0  // boolean : false , // char : " "
        //for any reference type:
        //null
        o4.displayInformation();

        ArrayList<Offer1Part> myOffers= new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);

        System.out.println("myOffers -----------------------");


        for( Offer1Part each  :  myOffers){
            each.displayInformation();
        }

        System.out.println(" my offers----for loop----");

        for (int x = 0; x <myOffers.size() ; x++) {
            Offer1Part each=myOffers.get(x);
            each.displayInformation();
        }

    }
}
