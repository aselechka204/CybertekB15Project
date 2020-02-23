package day31;

import org.w3c.dom.ls.LSOutput;

public class MethodPractice4 {
    public static void main(String[] args) {
     MethodPractice4.wakeUp();
     drinkCoffee();
     prepareKidsForSchool();
     studyJava();
     sayILove();
    }

    public static void wakeUp(){
        System.out.println("open your eyes");
        System.out.println("close your eyes");
        System.out.println("hear your alarm? open it again");
        System.out.println("----------");
    }

    public static void drinkCoffee(){

        System.out.println("put coffee in your coffee machine");
        System.out.println("make your coffee");
        System.out.println("-----------");
    }
    public static void prepareKidsForSchool(){

        System.out.println("wake them up 10 times");
        System.out.println("prepare their breakfast and lunch");
        System.out.println(" eat with them ");

    }
    public static void takeThemToSchoole(){
        System.out.println("Put them on the school bus");

    }
    public static void studyJava(){
        System.out.println(" think about java waking up");
        System.out.println("think about java drinking coffe");
        System.out.println("study study study");
    }
    public static void sayILove(){
        for (int i = 1; i <=300 ; i++) {
            System.out.print("i love java | ");

        }
    }
}
