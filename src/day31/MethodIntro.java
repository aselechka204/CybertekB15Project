package day31;

public class MethodIntro {
    public static void main(String[] args) {
    // two ways to call static methods
        // className.methodName(external data if needed)
        // if you are in same class ... you can directly call them
        // methodName(external data if needed)


        // why do we need a method ? reusable code...avoid duplicate code

      //  MethodIntro.sayHello();  // optional if you are in the same class
        System.out.println("Begin");
        sayHello(); //
        System.out.println("-------");
        sayHello();
        System.out.println("The End");
    }// main method ends here!!!
    // do not create a method inside a main method

    public static void sayHello(){
        System.out.println("Hello World");
        System.out.println("My name is Juma");
        System.out.println("I LOVE JAVA");

    }
}
