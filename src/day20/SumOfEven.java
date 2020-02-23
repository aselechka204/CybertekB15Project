package day20;

public class SumOfEven {
    public static void main(String[] args) {

       int sumOfEven= 0;
       int sumOffOff=0;

        for (int i = 10; i <=100 ; i++) {

            if(i%2==0){
                sumOfEven=sumOfEven+i;
            }else{
                sumOffOff=sumOffOff+i;
            }


        }

        System.out.println("Sum of ODD "+sumOffOff);
        System.out.println("Sum of EVEN "+sumOfEven);
    }
}
