package day22;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("1x1=" + 1 * 1);
        System.out.println("1x2=" + 1 * 2);
        System.out.println("1x3=" + 1 * 3);


     //   System.out.println("Multiplication table of 1");
    ////    for (int i = 1; i <= 12; i++) {
       //     System.out.println("1 x " + i + " = " + 1 * i);
    ////    }

     //   System.out.println("Multiplication table of 2");
    //    for (int base = 1; base <= 12; base++) {
      //      System.out.println("2 x " + base + " = " + 2 * base);

     //   }
    //    System.out.println("Multiplication table of 3");
    //    for (int base = 1; base <= 12; base++) {
    //        System.out.println("3 x " + base + " = " + 3 * base);


  //      }

        for (int times = 1; times <= 10; times++) {
            System.out.println("Multiplication table of " + times);
            for (int base = 1; base <= 12; base++) {
                System.out.println(times + " x " + base + " = " + times * base);

            }


        }


    }
}
