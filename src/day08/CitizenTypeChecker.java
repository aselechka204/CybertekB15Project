package day08;

public class CitizenTypeChecker {

    public static void main(String[] args) {

        String citizenType ;
        int age = 60 ;

        if( age > 65 ) {

            citizenType = "Senior";

        } else {
            citizenType = "Not Senior";

        }
        System.out.println("The persons age is " + age+ ", and he is a "+ citizenType);


    }
}
