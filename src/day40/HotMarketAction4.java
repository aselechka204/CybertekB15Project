package day40;

public class HotMarketAction4 {
    public static void main(String[] args) {

        Offer1Part o1= new Offer1Part();
        o1.company = "Apple";
        o1.location= "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;

         String o1Str= o1.toString();
        System.out.println("o1Str = " + o1Str);
        System.out.println(o1); //o1.toString;


    }
}
