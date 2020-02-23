package day45;

public class Phone extends Electronic {

    double size;
    double price;

    //sub class inherit every instance field static field

     // String brand;
    // static boolean useElectricity=true;
    // i have them but i dont see them brand and useElectricity


    // bad idea to have main here
    // but we are doing it anyway for less screen to look at

    public static void main(String[] args) {


        Phone p1= new Phone();
        p1.size=12;
        p1.price=399;
        p1.brand="Apple";


        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        // directly accessing the static field of the same class in static method
        System.out.println(useElectricity);

        // main method is the static method
        // how to call showBrand method
        p1.showBrand();

        /*
          public static void displayUseElectricity(){
        System.out.println("calling useElectricity "+ useElectricity);

    }     // how to call dislayUseElectricty static method
         */

         displayUseElectricity();
         //static way
         Electronic.displayUseElectricity();
         Phone.displayUseElectricity();
    }

}
