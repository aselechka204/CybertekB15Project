package day54;

public class AnimalShow {

    public static void main(String[] args) {


        //refer a dog object as a dog
        // it can do everything a dog can do (including Animal, indoorPet stuff)

        Dog d1 = new Dog();
        System.out.println("d1 = " + d1);
        d1.play();
        d1.speak();


        Animal a1= d1;
        a1.speak();
        // refer a dog object as a object
        //it can do only those things objects can do
        //example tostring hashcode and others

        Object o1= d1;

        //refer a dog object as a indoorpet
        //it can only play


        IndoorPet p1=d1;
        p1.play();
    }
}
