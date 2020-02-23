package day31;

public class Season {
    public static void main(String[] args) {

      //      String mySeason="Winter";

            decideSeasonAction("winter");
       decideSeasonAction("summer");
       decideSeasonAction("fall");
       decideSeasonAction("aaa");


    }


    public static void decideSeasonAction(String season){


        switch(season){
            case "winter":
                System.out.println("wear a jacket");
                break;
            case "spring":
                System.out.println("flowers are blooming");
                break;
            case "summer":
                System.out.println("swim season");
                break;
            case "fall":
                System.out.println("rainy season");
                break;
            default:
                System.out.println("invalid season");
        }

    }

}
