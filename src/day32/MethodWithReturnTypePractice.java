package day32;

public class MethodWithReturnTypePractice {
    public static void main(String[] args) {

        double result=divide(24,5);
        System.out.println(result);

        System.out.println(divide(10,3));
        System.out.println(divide(0,10));

    }



    public static double divide(double num1, double num2){
      // to avoid the result that we didnt not want use if statement
      if(num2==0){       // we check if num1 is 0
          return 0.0;     // if it is we just return 0
      }else{            //if not
          return num1/num2;   /// we return actual result
      }

        //  return num1/num2    ;

    }
}
