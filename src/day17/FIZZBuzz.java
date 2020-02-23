package day17;

public class FIZZBuzz {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 50) {

            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println(num + "is Fizz Buzz Number");
            } else if (num % 5 == 0) {
                System.out.println(num + "is Fizz Number");
            } else if (num % 3 == 0) {
                System.out.println(num + "Is Buzz Number");
            }
            ++num;
        }

            //   int num2 = 1;
            //   while(num2<100){
            //      System.out.println(num2);
            //      ++num2;
            // }
        }
    }
