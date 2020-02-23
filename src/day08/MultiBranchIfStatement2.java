package day08;

public class MultiBranchIfStatement2 {
    public static void main(String[] args) {

        int currentSpeed = 45 ;


        if (currentSpeed >90 ) {

            System.out.println("JAIL TIME!!!");

        } else if( currentSpeed > 80 ) {
            System.out.println(" reckless driving");

        } else if( currentSpeed >70 ) {
            System.out.println("POINTS given");

        } else if (currentSpeed >60 ) {
            System.out.println("warning");

        } else {
            System.out.println("keep driving");
        }

    }
}
