package day07;

public class Casting {
    public static void main(String[] args) {

        //int num = 10 ;

        // 10 is  implicitly (automatically) converted to double 10.0
        // and stored inside bigNum behind scene

        double bigNum = 10 ;
        System.out.println(bigNum);

        int num = (int) 12.99D; //This does not work bc its double number

        System.out.println(num);

        // create a long variable and store int
        //create an int variable


        int cookie = (int) 33.45; // converting int to long cup
        System.out.println(cookie);

        long earthToMoon = 10000;
        System.out.println(earthToMoon);

        int earth = (int) earthToMoon;
        System.out.println(earth);

     // double price = 99 ; 99--> 99.0
        // long earthToKrypton = 15000; 15000-->15000L.

        // int myMedCup = (int)100L;



    }


}
