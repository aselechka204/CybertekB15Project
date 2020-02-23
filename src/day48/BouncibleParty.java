package day48;

public class BouncibleParty {

    public static void main(String[] args) {

        Kangaroo b1= new Kangaroo("COCO", 10);
        System.out.println("b1 "+b1);
        b1.bounce();
        b1.eat();
        b1.carryChildInThePocket();

        Ball b2= new Ball ("Round", "Blue");
        System.out.println("b2 ="+ b2);
        b2.bounce();
        System.out.println(Bouncible.GRAVITY);
    }
}
