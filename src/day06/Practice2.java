package day06;

public class Practice2 {

    public static void main(String[] args) {

        // you have $2 , how many dimes you can get out
        // how many quarters you can get
        // how many nickles
        // ypu have purchased candle for 0.74 cent
        // what would be your remainder

        int cent = 200 ;

        cent -=74;
        int quarters = cent/25;
        int remainder= (cent%25);
        int penny = (cent%25);



        System.out.println( quarters);
        System.out.println(penny);


        int dime = cent/10;
        int rem = (cent%10);
        int penny2 = cent % 10 ;

        System.out.println(dime);
        System.out.println(penny2);








    }
}
