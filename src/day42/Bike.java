package day42;

public class Bike {

    int speed;
    int gear;

    // constructor is a block of code that has the same name as the class name and has no return type
    //if it does not meet above requirment it will not be a constructor
    //the only time you can call this is : when object is being created.

    public Bike(){

        System.out.println("message from constructor");
        gear=1;
    }

   public  Bike(int newGear){

        //gear= newGear;
       this.gear=newGear;

   }
   public Bike(int gear, int speed){

        this.gear= gear;
        this. speed= speed;

   }
   public Bike(String str){
       System.out.println("Accept String!!!!");
   }
}
