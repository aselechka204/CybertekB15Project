package day55;

public class Casting {

    public static void main(String[] args) {


        int x= 10;
        long y= x; // it works small cup into bigger cup ... implicitly\automatically

        byte b= (byte) x;

        Object o= new Dog("Chiwava"); // this is upcasting from type dog to object
      //  o.bark();

      //  Dog d= new Dog("Cookie"); // this is new object
        Dog d = (Dog) o; // this is downcasting from type object to dog
        d.bark();

        // in order to let the dog object bark, we need to refer a dog as a Dog or we dont have access to Dog only action
    }
}
