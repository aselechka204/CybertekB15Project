package day03;

public class PrimitivePractice {

    public static void main(String[] args) {


        int catCount = 20;
        System.out.println("catCount ");

        byte letterCount = 26;

        System.out.println("The letter count is " + letterCount);

        short sheepCount = 300;

        System.out.println("Sheep Count "+ sheepCount);

        long milesToSun = 10000000L;

        System.out.println("Miles to the Sun " + 10000000);


        long mileToMoon = 500000l;

        System.out.println(" Miles to The Moon " + mileToMoon );

        //----------floating point --------
        // you must add f at the end of number to indicate this is float data type
        // lower or upper case it doesnt matter as long as you use it.

        float priceOfBanana = 1.99f ;
        System.out.println("Price of the Bananas " + priceOfBanana);

        float priceOfPotatoes = 2.49f;
        System.out.println(" Price of Potatoes "+ priceOfPotatoes) ;

        //---------larger floating point number -----

        double priceOFiPad = 355.99d;
        System.out.println("Price Of The Ipad "+ priceOFiPad);

        double priceOfIpadPro = 1024.99D;
        System.out.println("Price of the Ipad Pro "+ priceOfIpadPro);
        // compiler automatically assumes its a double so its not required to have d
        //however for good programming habbit, add them always

        double priceOfMac    = 2299.99 ;
        System.out.println("Price of Mac " + priceOfMac);

        //If you have a whole number by itself, compiler automatically assumes it's a int
        //if you have a fractipnal number by itself, compiler automatically assumes it's a double





    }







}
