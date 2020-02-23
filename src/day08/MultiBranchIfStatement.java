package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {
        // Sudo code
        /*
        given your current speed , speedLimit
        check weather the current speed is
        more than 90--->jail
        more than --> 80 and less than 90 -->reckless driving


        more than 70 and less than 80 -->points
        more than 60 and less than 70 --> warning

        if not speeding keep driving

         */

        int currentSpeed = 90;


        if (currentSpeed >= 70 ) {

            System.out.println(" you are speeding more than 70mph ---POINTS");
            //asking whether its less than 70 and more than 60

        } else if ( currentSpeed >= 60 ) {
            System.out.println("Your speed is less than 70 but more than 60");
        } else {
            System.out.println("KEEP DRIVING YOU ARE GOOD");
        }




    }
}
