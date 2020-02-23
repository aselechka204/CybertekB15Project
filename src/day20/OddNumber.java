package day20;

public class OddNumber {
    public static void main(String[] args) {



        int sum = 0;


        for (int i = 10; i <=100 ; i++) {

            if (i % 2 == 1) {
            //    System.out.println(i);
                sum=sum+i;
            }


        }
        System.out.println("Sum"+sum);

    }
}
