package day05;

public class VariablePractice {

    public static void main(String[] args) {

        //  8 primitive data(boolean, double, float, int, short, byte...)
        // Block comment, everything is between ... /* tab tab tab /*
        // whole numbers : byte, short, int, double
        //fractional number: float, double
        //logical: boolean (true, false)
        //character (single character in signle quote)
        //Is string part of Primitive types? Noo!!
        // String is sequence of character
        // usually by default for the whole number: just use int
        //usually by default for the fractional number: just use double

        // age calculator
        // given birth year, please calculate the age

        int year = 2019;
        int birthYear = 1985;
        int age = year - birthYear;

        System.out.println("i was born in " + birthYear  + ", and I am " + age + "years old.");

        // you are speeding today
        // speed limit is number, and your speed is
        //generate this output of " you are driving 10 mile more than speed limit

        int currentSpeed = 70;
        int mySpeed = 80;
        int over = mySpeed - currentSpeed ;

        System.out.println("My speed limit is " + mySpeed +". The speed limit thats allowed is " + currentSpeed + ", I am going " + over+ " miles above the speed limit.");









    }


}
