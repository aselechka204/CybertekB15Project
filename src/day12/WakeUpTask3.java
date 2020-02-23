package day12;

public class WakeUpTask3 {
    public static void main(String[] args) {
        int module = 15;

        if (module%5==0 && module%3==0){
            System.out.println("FizzBuzz Number");
        } else if (module%5==0){
            System.out.println("Buzz Number");
        } else if (module%3==0){
            System.out.println("Fizz Number");
        } else {
            System.out.println("NOT MY NUMBER");
        }

    }
}
