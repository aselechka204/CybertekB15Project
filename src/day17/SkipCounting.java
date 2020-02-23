package day17;

public class SkipCounting {
    public static void main(String[] args) {
        // skip counting by 3 from 0 till 30

        // 3 6 9 12 15 18 21 24 30

        int counter = 0;

        while(counter <30  ){
            counter+=3;
            System.out.print(counter+" ");
           // counter=counter+3;

        }
        System.out.println("-----------------");
       int counter2 = 0;

        while (counter2<=50){
            System.out.print(counter2+" ");
            counter2=counter2+2;

        }

        System.out.println("------------------");

          int odd = 1;
        while(odd<50){

            System.out.print(odd+" ");
            odd=odd+2;


        }
    }

    }



