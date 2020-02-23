package day47;


//i dont need to create car object using this class
//i only want this class to be super class to provide
//reusable fields and methods for sub classes

//this class is designed is to be a super class

public abstract class Car {

    int year;
    String brand;

    //public void start(){}

    //abstract can have abstract method
    //it has abstract keyword
    //and it does not have body, DOES NOT HAVE{}
    //IT ENDS WITH ;
    //it is meant to be overridden to provide body in sub class

    public abstract void start();

        // add abstract methods:
       // goForward
       // goBackward
    // turn(String direction)
        public abstract void goForward();

        public abstract void goBackward();

        public abstract void turn(String direction);

        public void doCarthing(){
            System.out.println("non abstract method can be a abstract class ");
        }


}
