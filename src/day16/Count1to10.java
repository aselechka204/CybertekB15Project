package day16;

public class Count1to10 {
    public static void main(String[] args) {
        int counter = 1;

        while(counter <=10  ){
        //    ++counter;
            System.out.println(counter++);

            System.out.println("----------------------------------");

            int counter1 =0;
            while( ++counter1<=10  ){
                System.out.println(counter1);
            }


            System.out.println("----------------------------------");

            int counter2 =1;
            while(counter2++ <11      ){
                System.out.println(counter2);

            }

        }
    }
}
