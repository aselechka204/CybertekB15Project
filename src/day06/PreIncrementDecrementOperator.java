package day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        // initializing offer count value to 2

        int offerCount = 2;
        //increasing the number by 1 using normal way
        offerCount = offerCount + 1;
        offerCount +=1;
        ++ offerCount; // it will increase it just by 1

        // since increasing or decreasing a value is very special
        // and ofter used in programming
        // there is even shorter shortcut for this operation
        // and we use ++ or -- , THIS IS EXCLUSIVELY FOR CHANGING VALUE BY 1.

        System.out.println("Job offered at the moment " + offerCount);

        --offerCount;
        System.out.println("Job offered decreased " +offerCount);








    }




}
