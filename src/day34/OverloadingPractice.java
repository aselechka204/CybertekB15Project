package day34;

public class OverloadingPractice {
    public static void main(String[] args) {
        add(15);
        add(15,45);
        add(15,43,67);
        add(15L, 23L);

    }

    public static void add(int num1){
        System.out.println("calling add(int num1) "+(num1+100));

    }
    public static void add(int num1, int num2){

        System.out.println("calling add(int num1, int num2) "+(num1+num2));

    }
    public static void add(int num1, int num2, int num3){

        System.out.println("calling add(int a, int b, int c)"+(num1+num2+num3));
    }

    public static void add(long num1, long num2){
        System.out.println("calling add(long num1, long num2 "+ (num1+num2));
    }
}
