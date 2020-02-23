package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {
    private static Object ArrayList;

    public static void main(String[] args) {

        ArrayList<String>nameLst=new ArrayList<String>();

        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");

      printAList(nameLst);
        // create a method that accept a list of string as argument
        // and print out each and every item in the list vertically
        //and print out each and every item in the list vertically
    }






        public static void printAList(ArrayList<String> lst){

        for(String each:lst){
            System.out.println("each= "+each);
        }

        }

}
