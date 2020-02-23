package day51.Polymorphim;

public class Animal {
    public void makeNoise(){
        System.out.println("general animal noise");
    }


}
// i can add more classes as long as only one class is public and name is same as file name
   class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Woof!!!");
    }

   }


   class Horse extends Animal{
    @Override

       public void makeNoise() {
        System.out.println("NeiNei");
    }
       }

