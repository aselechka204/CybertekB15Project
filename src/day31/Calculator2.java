package day31;

public class Calculator2 {
    public static void main(String[] args) {

     calculator(20,5,'*');

    }

  // order of method parameter decide how caller of this method should call it
    public static void calculator(int num1, int num2, char operator){
       // char operator='+';
      //  int num1=15;
     //   int num2=3;
        switch(operator){
            case'+':
                System.out.println("Addition result is"+ (num1+num2));
                break;
            case'-':
                System.out.println("Subtraction result is "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication result is "+ (num1*num2));
                break;
            case '/':
                System.out.println("Division result is "+(num1/num2));
                break;
            default:
                System.out.println("Invalid Operator");

        }

    }
}
