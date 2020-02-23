package day42;

public class Bike2 {

    public static void main(String[] args) {

        Bike b1= new Bike("abc");
        Bike b2= new Bike();
        System.out.println("b1.gear= "+b1.gear);
        System.out.println("b2.gear= "+b2.gear);

        // i want to be able to set the default gear to
        //any number i specify when object is being created
       Bike b3 = new Bike(4);
        System.out.println("b3.gear=" + b3.gear);
        
        Bike b4 = new Bike(3,55);
        System.out.println("b4.gear = " + b4.gear);
        System.out.println("b4.speed = " + b4.speed);

    }
}
