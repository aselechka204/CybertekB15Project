package day43;

import java.util.Arrays;
import java.util.List;

public class Animal2 {
    public static void main(String[] args) {


        
        Animal p1= new Animal();
        System.out.println("p1 = " + p1);
        p1.speak();
        p1.setType("cow");
        p1.speak();



        Animal p2 = new Animal("horse","Walter");
        Animal p3 = new Animal("cat","Samantha");
        Animal p4 = new Animal("dog","Oliver");
        Animal p5 = new Animal("dog","Henry");
        Animal p6 = new Animal("cow","Adam");
        Animal p7 = new Animal("ant","Atom");
        Animal p8 = new Animal("bear","Teddy");
        Animal p9 = new Animal("cat","Stephanie");

        List<Animal> myAnimals= Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
        System.out.println("MyAnimals= "+myAnimals);


        for (Animal each:myAnimals) {
            System.out.println(" = " + each.getName());

        }
        System.out.println("------------");
        for(Animal each: myAnimals){
            if(each.getType().equalsIgnoreCase("cat")){
                System.out.println("cat name is : "+ each.getName());
            }
        }
    }
}
