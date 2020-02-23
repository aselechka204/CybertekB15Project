package day18;

public class ForLoopIntro {
    public static void main(String[] args) {
        // count 1 to 5
        //1st part initialization: it will run only once when you enter the loop
        //2nd part termination condition: loop will stop if its false, it will be checked everytime
        //3rd part increment or decrement to change condition eventually it will run after each iteration

        for (int x =1; x<=5 ; x++  ){

            System.out.println("x= "+x+" Happy Birthday Roksana");


        }

        for(int counter = 5; counter >0; counter--){
            System.out.println("counter "+ counter);
        }
    }
}
