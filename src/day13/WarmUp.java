package day13;

public class WarmUp {
    public static void main(String[] args) {
        // create a boolean store the result of doyouwanttoshop
        //if yes, do you want to go to the store or shop online?

        boolean youWantToShop = true ;
        String preference = "Store";

      //  if( youWantToShop == true ){
        if(youWantToShop) {

            if (preference.equals("Online")){
                System.out.println("Going to store for shopping");
            } else {
                System.out.println("Going to online for shopping");
            }

        } else {
            System.out.println("good job stay home coding!!!");

        }
    }
}
