package day47;

public  class Garage {

    public static void main(String[] args) {

        //abstract class cannot be instantiated
        //it means we cannot create object out of it
     //   Car c1= new Car();


        ElectricCar e1= new ElectricCar();

        e1.start();
        e1.goBackward();
        e1.goBackward();
        e1.turn("left");


        // create another subclass of Car
        // called GasCar
        //add a field called gasLevel
        //implement all the abstract method of Car class
    }
}
