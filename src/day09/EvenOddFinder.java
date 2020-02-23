package day09;

public class EvenOddFinder {
    public static void main(String[] args) {

        int myNumber = 301;

       // System.out.println( myNumber/2 );
       // System.out.println( myNumber%2); // to find Odd or even number

       // int remainder = myNumber%2;
        //if ( remainder ==0 ){

        if (myNumber%2==0){

            System.out.println(" This number is even ");
        } else {
            System.out.println(("This number is odd"));
        }
        System.out.println( " The End ");


    }
}
