package day51.Polymorphim;

public class AnimalShow {
    public static void main(String[] args) {

      //  Dog d1= new Dog();
        // we are referring Dog objext using Animal reference

        Animal g1= new Dog();
              g1.makeNoise();
              // reassining g1 to a different object
              g1=new Horse();
              g1.makeNoise();

              Animal a2 = new Horse();
              a2.makeNoise();

        //      Dog d1= new Horse(); you cant do that bc they dont have relationship

              Dog d1 = new Dog();
              d1.makeNoise();

              Animal a3= d1;
              a3.makeNoise();
    }
}
