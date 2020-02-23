package day06;

public class Test {

    public static void main(String[] args) {

        int bankBalance = 1140 ;



        System.out.println("I have spent half of the money: " + bankBalance);
        // bankBalance = bankBank / 2;

        bankBalance /= 2;

        System.out.println(" Now my Balance is cut in half " + bankBalance);

        // i want to divide the balance by 500 and keep the remainder in my pocket

       // bankBalance = bankBalance % 500;
        bankBalance %= 500 ; // 570 divide by 500, remainder is 70$

        System.out.println(" I want to device the balance by 500 and keep the remainder in my pocket");

        System.out.println(" My remainder is $ " + bankBalance);
    }
}
