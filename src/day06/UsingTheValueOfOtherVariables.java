package day06;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {

        int myFaveNumber = 300;
        int yourFaveNumber = myFaveNumber;



        System.out.println("myFaveNumber" + myFaveNumber);
        System.out.println("Your Fave number "+ yourFaveNumber);

        yourFaveNumber = 100;





        System.out.println("myFaveNumber" + myFaveNumber);
        System.out.println("Your Fave number "+ yourFaveNumber);



    }
}
