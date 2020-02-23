package day54;

import day51.Person;

public class Clothes {

    int size;

    public static void main(String[] args) {

        Clothes c1= new Clothes();
       // Wearable w1= new Clothes();
        Object o1= new Clothes();
        //---------
        Watch wa= new Watch();
        Wearable w2= new Watch();
        Object o2= new Watch();
        //---------
        Perfume p1 = new Perfume();
        Wearable w3= new Perfume();
        Cosmetics c2 = new Perfume();
        Object o3= new Perfume();

        MakeUp m1= new MakeUp();
        Wearable m2= new MakeUp();
        Cosmetics m3= new MakeUp();
        Object o4=  new MakeUp();
    }
}

 class Watch implements Wearable{

     @Override
     public void wear() {
         System.out.println("wearing clothes");

     }
 }

class Perfume implements Wearable, Cosmetics{


    @Override
    public void wear() {
        System.out.println("wearing a whatch");
    }
}
class MakeUp implements Wearable, Cosmetics{

    @Override
    public void wear() {
        System.out.println("wearing makeup");
    }
}