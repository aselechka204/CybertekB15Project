package day49;


//interface is like a contract , once someone sign a contract he/she will provide all the details that that must do

import org.w3c.dom.ls.LSOutput;

public interface Edible {

  //INTERFACE IS NOT A CLASS ...

  //  public static final ...in interface fields are automatically  if not defined
    //public static final field naming convention is ALL CAPS !!
    //you can have as many CONSTANT (public static final) as you want
    boolean IA_HUMAN_FOOD=true;


    //if a moethod with no body is not defined public abstract , its automatically public abstract
  public abstract void eat();

    public abstract void drink();


    //default method was added since java 8 to provide
  //default implementation to not break existing implementing
  //classes have option to use it as is
  //or override it according to their own reqirments
  // default method must have body
 // implementing
  public default void digest(){
      System.out.println("You implement the code yourself");
    }


}
