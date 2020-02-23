package day47;
// cannot extend find class
//public final Sport { // extends String{

  public class Sport{

      //final method cannot be overriden in sub class
      //it can be used as is in subclass
      // just like the family tradition it should stay the same generations to come
      public final void doSomething(){
          System.out.println("doing regular sport");
      }

      public void doSomethingElse(){
          System.out.println("something else");
      }
  }



