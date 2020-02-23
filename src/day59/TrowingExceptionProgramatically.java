package day59;

public class TrowingExceptionProgramatically {

    public static void main(String[] args) {

      //  NullPointerException e1= new NullPointerException();

        NullPointerException e2= new NullPointerException("Back to earth");
        System.out.println(e2.getMessage());

        // how do i programatically throw exception myself
        //we use throw keyword followed by exception object
        // (or the variable that pointing to the exception object)
        throw e2;  //throw is the keyword that has one purpose of throwing the exception to the runtime

        //throw and throws mean different things

        //throw - is used to programmatically throw exception to the runtime to control the program flow

        //throws - write in the mail method
    }
}
