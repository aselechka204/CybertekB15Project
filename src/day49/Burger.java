package day49;


//you are building super-sub relationship, IS A relationship

public class Burger implements Edible, Juicy{



    @Override
    public void eat() {
        System.out.println("Eat burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger then drink soda ");

    }

    @Override
    public void melting() {
        System.out.println("Juicy burger is melting");
    }
}
