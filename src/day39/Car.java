package day39;

public class Car {

    String model;
    String make;
    String color;
    int year;

    //instence methods are tied to the object
    //it does not have static keyword
    // we need an object when we call them
    public void goForward(){

        System.out.println(make+" going forward ");
    }

    public void printAge(){
        System.out.println("car age: "+(2020-year));

    }


    public static void main(String[] args) {

        Car c1=new Car();
        c1.model="Corolla ";
        c1.make="Toyota ";
        c1.color="Blue ";
        c1.year= 1985;
        c1.goForward();
        c1.printAge();

        System.out.println("model: "+c1.model+" | make: "+c1.make+" | color: "+c1.color+" | year: "+c1.year);

        Car c2= new Car();
        c2.year=2017;
        c2.make=" Huyndai";
        c2.model="SantaFe";
        c2.color="black";
        c2.goForward();
        c2.printAge();
        System.out.println("model: "+c2.model+" | make: "+c2.make+" | color: "+c2.color+" | year: "+c2.year);

        c2.year=2020;
        System.out.println("car2 year is "+c2.year);

        c2.color=c1.color;
        System.out.println("car 2 color was black became "+c2.color);


    }


}
