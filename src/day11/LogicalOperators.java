package day11;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Truth table && is and ");
        System.out.println("result of true && true = "+(true&& true ));

        System.out.println("result of false& true = "+(false&& true ));

        System.out.println("result of true && false = "+(true&& false ));

        System.out.println("result of false && false = "+(false&& false ));

        System.out.println( "This example is || is OR");

        System.out.println("result of true || true = "+(true || true ));

        System.out.println("result of false || true = "+(false || true ));

        System.out.println("result of true || false = "+(true || false ));

        System.out.println("result of false || false = "+(false || false ));

        // create a variable called num with type int
        // find out whether this number is more than 100 or less than 10



        int num = 55;

            System.out.println("The or result is : "+(num > 100 || num < 10 ));
        System.out.println("The and  result is : "+(num > 100 && num < 10 ));
        System.out.println("The range number is : "+ num);

        // more than 2 conditions at the same time, 3 conditions
        System.out.println(true || false || false );
        System.out.println( true && true && false );
        System.out.println(   num==50 || num==51 || num==55       );// 1 true statement makes it true

        // == checking for equality
        // != checking for inequality
                    //        true                   false    ---> true
        System.out.println( num>50 && num != 52 || num==57    );


        System.out.println(   false || true &&true);



    }
}
