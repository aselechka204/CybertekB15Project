package day37;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {

        ArrayList<String>teamMates= new ArrayList<>();


        teamMates.add("Asel");
        teamMates.add("Aysegul");
        teamMates.add("Gala");
        teamMates.add("Tarana");
        teamMates.add("Gulnaz");
        teamMates.add("Artur");
        teamMates.add("Muharajon");
        teamMates.add("Teyfulla");


        System.out.println("teamMates="+teamMates);

        //first item
        System.out.println("first item "+ teamMates.get(0));

        //get last item index
        int last =teamMates.size()-1;
        System.out.println("last item "+teamMates.get(last));


        System.out.println("ALL ITEMS:");
        for (int x = 0; x <teamMates.size() ; x++) {
            System.out.println("item = " + teamMates.get(x));

        }

        System.out.println("\n ALL ITEMS IN REVERSE ORDER:");
        for (int i = last; i >=0 ; i--) {

            System.out.println("teamMates = "+(i+1)+"="+ teamMates.get(i));
        }
        System.out.println("\nPrint 2 items at a time:");
        for (int x = 0; x <=teamMates.size()-2 ; x+=2) {
            System.out.println("\t"+teamMates.get(x)+"--- "+teamMates.get(x+1));
        }
        System.out.println("\nPrint 2 items at a time:");
        for (int x = 0; x <=teamMates.size()-2 ; x++) {
            System.out.println("\t"+teamMates.get(x)+"--- "+teamMates.get(x+1));
        }
        System.out.println("\nseperate by dash");
        String result="";
        for (int x = 0; x <teamMates.size() ; x++) {
            result=result+teamMates.get(x)+"-";

        }
        System.out.println("result"+result);


        String lstToString= teamMates.toString();
        System.out.println("lst to string after replacing =\n"+lstToString.replace(",","-"));
        }


}
