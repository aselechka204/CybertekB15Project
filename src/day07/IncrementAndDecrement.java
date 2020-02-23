package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {
        int apple = 10 ;
        System.out.println("Original apple" + apple);

     //   apple = apple +1;
    //    apple +=1;
        ++apple;
        ++apple;


        System.out.println("Used ++ twice " + apple);


        --apple;

        System.out.println( "used -- once " + apple);

      //  System.out.println(++apple);
        System.out.println("used ++ to increment and concatenate : " +  (++apple) );



    }
}
