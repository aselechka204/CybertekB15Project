package day04;

public class ArithmeticPractice {

    public static void main(String[] args) {


        System.out.println( 5 + 3 ); // 8
        System.out.println( 5 - 3); // 2
        System.out.println( 5 * 3 ); // 15
        System.out.println( 5 / 3 ); // 1

        // arithmetic operator between two int -->> will generate another int
        // arithmetic operator between two int between two data type
        // the final result will be larger data type
        System.out.println( 5 + 3.0d ); // 8
        System.out.println( 5 - 3.0d); // 2
        System.out.println( 5 * 3.0d ); // 15
        System.out.println( 5 / 3.0d ); // 1
        System.out.println( 5 / 3.0f ); //

        // store above numbers in variables
        // and replace above statements with variables instead
        //data type resutls1=

        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;

        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);



    }




}
