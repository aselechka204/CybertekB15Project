package day14;

import jdk.jshell.spi.ExecutionControl;

public class Practice {
    public static void main(String[] args) {
        //spring, summer, fall --->ducks are active
        //winter ---> ducks sleep:

        String season = "winter";



        if(season.equalsIgnoreCase("spring") || season.equalsIgnoreCase("summer") || season.equalsIgnoreCase("fall")){

            System.out.println("bear is active");

        }else if(season.equalsIgnoreCase("winter")){
           System.out.println("bear is sleeping");
       }

        //if(season.equalsIgnoreCase("spring")){
        //    System.out.println("bear is active");
      //  } else if(season.equalsIgnoreCase("summer")){
      //      System.out.println("bear is active");
     //   } else if (season.equalsIgnoreCase("fall")){
      //      System.out.println("bear is active");
      //  } else if (season.equalsIgnoreCase("winter")){
      //      System.out.println("bear is sleeping");
    //    }



    }
}
