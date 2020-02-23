package day10;

public class MultiBranchPractice {
    public static void main(String[] args) {

        // at the MCDonalds drive thru

        System.out.println("Welcome to McDonald, what can i get for you?");

        int itemNumber = 35 ;
        String order = "" ;


        if ( itemNumber ==11 ){
            System.out.println(" You have selected # 11, Burger");
            order = "Burger";

        } else if (itemNumber == 5){
            System.out.println("You have selected #5");
            order= "French Fry";

        } else if (itemNumber==8){
            System.out.println("You have selected # 8");
            order = "Nuggets" ;
        } else if (itemNumber == 35){
            System.out.println("You have selected 35");
            order = "Ice Cream";
        } else {
            System.out.println("You have selected unknown item number!");
            order = "Uknown";
        }

        System.out.println("Your order is complete +!!!"+ order);


    }
}
