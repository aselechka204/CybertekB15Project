package day48;

public class Kangaroo implements Bouncible {

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance){

        this.name=name;
        this.jumpDistance=jumpDistance;
    }


    public void eat(){
        System.out.println("Kangaroo with name"+ name +"is eating ");
    }

    @Override
    public void bounce(){

        System.out.println("This "+name+"can jump"+jumpDistance+"meters forward and it would be nice to ");
    }


    public void box() {
        System.out.println("Kangaroo with name "+name+" is boxing");
    }


    public void carryChildInThePocket() {
        System.out.println("Kangaroo with name "+name+"carry child in the pocket");
    }
}
