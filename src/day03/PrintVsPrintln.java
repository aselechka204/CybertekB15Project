package day03;

public class PrintVsPrintln {


    public static void main(String[] args) {
        System.out.println("Begining");
    printHello();
        System.out.println("-----");
        printHello();
        System.out.println("The End");



  }

    public static void printHello() {

        System.out.println("Hello World line 1");
        System.out.println("Hello World line 2");
        System.out.println("Hello World line 3");


        System.out.print("Hello World line 4");
        System.out.print("Hello World line 5");

        System.out.println("Hello World line 6");
        System.out.println("Hello World line 7");

        System.out.println("Hello\tworld");
    }

}
