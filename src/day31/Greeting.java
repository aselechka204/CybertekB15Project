package day31;

public class Greeting {
    public static void main(String[] args) {

        sayHello();


        sayHelloTo(" Damir Gazizov");


    }
   /// i want to create a method that do below:
    // say hello to the person's name i  when i call this method

    // sayHelloTo("Batch15") ---> print hello batch 15
    //sayHelloTo("kids")----> print hello Kids

    public static void sayHelloTo(String name){

        System.out.println("hello"+ name);

    }



    public static void sayHello(){
        System.out.println("hello Asel");
    }
}
