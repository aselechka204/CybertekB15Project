package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {
    public static void main(String[] args) {

        // only reference type decide what you can access at compile time
        // if we have fruit as reference type, getdigested methos will point to the one under fruit class
        //actual object


        Apple a1= new Apple("sweet","red","Fuji");

        // what can i access using reference variable a1 --->
        // a1 has Apple as reference type, so we can access anything inside apple
        System.out.println("a1 taste= " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        a1.getDigested();

        // ------------------------------

        System.out.println("//---------------");

        Fruit f1= new Orange("sout-sweet", "reshish", 11);

        System.out.println("f1 taste= " + f1.taste);
        System.out.println("f1.color = " + f1.color);

        System.out.println(f1.toString());
       // f1.taste   we cannot access type coming from apple if we refer it as fruit
        f1.getDigested();

        //Fruit is reference type
        //Apple is actual object type
        Fruit f2= new Apple("crispy but tasty","hot red","Gala");

        Fruit f3= new Orange("sour", "orange",12);

        Fruit f4= new Orange("sweet", "Blood Red", 10);





        Fruit[] myFruit={f1,f2,f3,f4};

        for (Fruit each:myFruit) {
            each.getDigested();
        }

        // regular list with 4 items
        List<Fruit>fruitList= new ArrayList<>(Arrays.asList(f1,f2,f3,f4));

        for (Fruit each:fruitList) {
            System.out.println("each.toString()="+each.toString());
            System.out.println("class type"+each.getClass().getSimpleName());
        }
    }
}
