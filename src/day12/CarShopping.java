package day12;

public class CarShopping {
    public static void main(String[] args) {
        //buy corolla or Tesla (only if it's within the budget)

        String carBrand = "Corolla";
        int carPrice =60000;
        int budget = 40000;

       // if ( carBrand.equals("Corolla")|| (carBrand.equals("Tesla") && carPrice <= budget) ){
        //    System.out.println(" CAR ACQUIRED!!!");
       // } else{
       //     System.out.println("NOT WHAT I'M LOOKING FOR");
      //  }
   if (carBrand.equals("Corolla")){
       System.out.println("Car Acquired!!!");
   } else if (carBrand.equals("Tesla") && carPrice<=budget){
       System.out.println("Car Acquired!!!");
   } else{
       System.out.println("NOT WHAT I AM LOOKING FOR");
   }



    }
}
