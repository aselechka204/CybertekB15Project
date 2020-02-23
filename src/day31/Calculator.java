package day31;

public class Calculator {
    public static void main(String[] args) {
   add(20,23);
   add(85,15);
add3Numbers(20,20,20);

    }

    // a static method that has 2 parameters
    public static void add(int num1, int num2){

        System.out.println("addition result "+(num1+num2));
    }

    public static void add3Numbers(int num1, int num2, int num3){
        System.out.println("addition 3 numbers"+(num1+num2+num3));
    }
}
