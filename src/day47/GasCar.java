package day47;

// this is called concrete class
// concrete class must provide body for all inhereted abstract methods
// or it will not compile
public class GasCar extends Car {

   int gasLevel;


// implementing an abstract method in sub class means
    // providing body for the method in sub class


    @Override
    public void start() {
        System.out.println(" Gas car Start the engine");
    }

    @Override
    public void goForward() {
        System.out.println("Gas car Moving Forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Gas car Moving Backwards");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Gas car turning to the "+direction);
    }




    public static void main(String[] args) {

        GasCar g1= new GasCar();

        g1.start();
        g1.goBackward();
        g1.goForward();
        g1.turn("Right");

    }
}
