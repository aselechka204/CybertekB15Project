package day47;

public class ExtremeSport extends Sport {


  //  @Override
  //  public void doSomething() {
 //       System.out.println("doing extreme sport");
 //   }
// cannot override but you can overload it by
    // adding new data will let you use it
         public void doSomething(int x) {
             System.out.println("doing extreme sport");
        }

    @Override
    public void doSomethingElse() {
        System.out.println("doing something else in extreme sport");
    }
}
