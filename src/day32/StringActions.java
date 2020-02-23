package day32;

public class StringActions {
    public static void main(String[] args) {


reversePrintMyName();
withoutTheDash("Alashka");
withoutTheDash("Adamchik");

    }
     // each and every character of a string with dash in between exluding the last one   Akbar-->
    // keep adding dash after each character... by the last character dont add it
    public static void reversePrintMyName(){

        String name="Aselya";

        for (int i = name.length()-1; i >=0 ; i--) {

            System.out.print(name.charAt(i)+" ");

        }
        System.out.println();

    }

    public static void withoutTheDash(String name){


      //  String name= "Damir";
        for (int x = 0; x <name.length() ; x++) {
            System.out.print(name.charAt(x));
            if(x!=name.length()-1){
                System.out.print("-");
            }
        }
        System.out.println();
    }


}
