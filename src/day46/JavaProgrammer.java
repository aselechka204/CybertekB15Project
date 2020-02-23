package day46;

import jdk.swing.interop.SwingInterOpUtils;

public class JavaProgrammer extends Programmer{


    @Override
    void code() {
        System.out.println("I CODE JAVA!!!");
      //  super.code();
    }

    @Override
    void test() {
        System.out.println("WE DO TEST IN UNIT!!!");
     //   super.test();
    }

    public void drinkCoffee(){
        System.out.println("Java Programmers drink lots of coffee");
    }

    public void doJavaDevelopment(){
        System.out.println("Java programmers do Java Development"
        );
    }
}
