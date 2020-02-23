package day48;

public interface Bouncible {


    public static final double GRAVITY=9.81;
     // this is exvlusive to interface type
     // nowhere else you get this at all!!!

    // if we dont add any part of public static final for the field
    //all interface fields are automatically public static final
    // EVERY MEMBER OF INTERFAE AUTOMATICALLY PUBLIC
    //if no access modifier is given
    //all the method with no body automatically public abstract

    public abstract void bounce();


}


