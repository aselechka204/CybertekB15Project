package day55;

public class Calculator {
    private int result;


    public Calculator minusNum(int num){
        this.result-= num;
        return this;
    }

    public Calculator addNum(int num){
        this.result+=num;
    //    Calculator c= new Calculator();
    //    return c;
   // it will return the same object you used to call this method
        // it will allow method chaining using same object
        return this;

    }

    public void displayFinalResult(){
        System.out.println("final result= "+ result);
    }

    public static void main(String[] args) {

        Calculator c1= new Calculator();
       System.out.println(c1.result);
      // c1.addNum(100);
      // System.out.println(c1.result);

       c1.addNum(100).addNum(200).minusNum(100).displayFinalResult();
    //    System.out.println("adds all numbers "+c1.result);

      //  c1=c1.addNum(100);
      //  c1=c1.addNum(200);
     //   c1=c1.addNum(100);

    }
}
