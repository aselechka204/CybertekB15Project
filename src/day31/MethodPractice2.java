package day31;

public class MethodPractice2 {
    public static void main(String[] args) {
      /// write code from 1 to 10


        numbersCount();
        numbersCount();
        MethodPractice2.numbersCount();
    }


    public static void numbersCount(){

        for (int x = 1; x <=10 ; x++) {
            System.out.print(x+" ");

        }
        System.out.println();
    }

}
