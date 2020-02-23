package day07;

public class PreIncrementAndPostIncrement {

    public static void main(String[] args) {

        // increment
        int apple = 8;

        apple++ ;

        System.out.println( apple);
        //System.out.println( ++ apple);

        // when apple++ , ++ comes after the variable (POST INCREMENT)
        //But it will reflect the increased value next time the variable shows up!
        System.out.println( apple++ );
        System.out.println(apple);

        int score = 50 ;

        System.out.println( ++score);//51
        System.out.println( score++); // 51
        System.out.println(score); //52
        System.out.println( --score); //51
        System.out.println( score--); //51
        System.out.println( score); //50



    }
}
