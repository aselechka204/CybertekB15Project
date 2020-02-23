package day36;

public class MethodWithWrapperTypes {
    public static void main(String[] args) {

        Integer i1= 12;
        Integer i2= 20;

      sumAndPrint(i1, i2);

      // we directly passed int so autoboxing can take care of converting to object
        // f not specified otherwise this is recommended
      sumAndPrint(23, 10);
        System.out.println("----- method with int parameter------");

      printTheDoubleValue(10);
      // why we can pass Integer Object to a method that accept int
        // it will turn it into int by the power of auto unboxing

      printTheDoubleValue(new Integer(10));
      printTheDoubleValue(Integer.valueOf(30));

     // we used new keyword to provide 2 integer objects
      sumAndPrint(new Integer(23), new Integer((10)) );

        // it is expecting 2 integer object and we use Integer.valueOf() to provide 2 integer objects
      sumAndPrint(Integer.valueOf(23), Integer.valueOf(10));

    }

    public static void sumAndPrint(Integer num1, Integer num2){
     // we cannot add two objects
        //what is happaning here is
        // the moment the + operator appeared , compuler will turn num1 and num2 into int so it can add them numerically
        //Integer to int conversion -->> auto unboxing
        System.out.println(num1+num2);


    }

    public static void printTheDoubleValue(int x){
        System.out.println("after doubling x= "+(x*2));
    }
}
