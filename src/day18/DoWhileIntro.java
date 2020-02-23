package day18;

public class DoWhileIntro {
    public static void main(String[] args) {
    //    do {
    //        take some action here and repeat it
   //          while (some condition is true);
   //
   //     }

        int x =1 ;

        do {
            System.out.println(x);
            ++x;
        } while(x<=5);

        System.out.println("----------------");

        int y = 5;

        do{
            System.out.println(y);
            --y;

        }while(y>=0);

        // while loop  vs do while loop
        // The difference between 2
        /*
        While loop checks the condition first then enter the statement
        do While loop will take the action at least once then check the condition

        do While loop always run at least one iteration

        while loop might not even run!!!
         */


    }
}
