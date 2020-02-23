package day52;

public class ShapePolymophism {
    public static void main(String[] args) {

//ONLY the REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS WITH THAT VARIABLE
//for example, if we create object from Drawable then we can access only .draw() method because
//it is the only method inside the Drawable interface.
//If we create object from Circle class then we can access what ever available in the Circle class
//such as draw(), calculateArea(), radius and the ones from Circle's super class.


        Circle s1 = new Circle("penny", 5);
        //  Shape s1 = new Circle("penny", 5);
        //   Object s1 = new Circle("penny", 5);

     //   Drawable s1= new Circle("penny", 5);

     //   s1.draw();
        //how do i know what is the actual objext type


        System.out.println(s1.toString());

        System.out.println(  s1.getClass().getSimpleName());

    }
}
