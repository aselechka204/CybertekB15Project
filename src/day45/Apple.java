package day45;

public class Apple extends Fruit {

    //if we dont have any constructor , we will get default constructor
    //and compiler automatically call no arg constructor of super class
    //by inserting super();

    public Apple(){
          super();
        // if you dont call a constructor it will call the first one byitself
      //  super();
        // i want to reuse functionality already written in super class constructor
        //we can use super() or super(arguments here)
        //to call super class constructor

   // super("test");
    //can we use this super() call more than once
        //NO!!! you can call only once ...
        System.out.println("message from apple constructor");
    }

    public static void main(String[] args) {

        Apple a1= new Apple();



    }
}
