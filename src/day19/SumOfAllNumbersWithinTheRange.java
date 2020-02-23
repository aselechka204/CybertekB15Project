package day19;

public class SumOfAllNumbersWithinTheRange {
    public static void main(String[] args) {
        // get the sum of all the number 1-10 (1+2+3+4+5+6+7+8+9)

        int sum = 0; // nothing has been added yet
        /*
        sum =sum+1    = 1
        sum=sum+2     =3
        sum=sum+3     =6
        sum=sum+4     =10

        sum=sum+i;
         */

        for (int i = 1; i <=10; i++) {
          //  System.out.println(i);
            sum=sum+i;


        }
        System.out.println(sum);
    }
}
