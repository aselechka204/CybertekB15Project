package day11;

public class Practice {
    public static void main(String[] args) {
        String light = "ki";

      switch ( light) {
          case "bd":
              System.out.println("You turned on BEDROOM light!");
              light = "BEDROOM";
              break;
          case "li":
              System.out.println("You have turned on LIVING ROOM light");
              light = "LIVING ROOM";
              break;
          case "ki":
              System.out.println("You have turned on KITCHEN LIGHT");
              light = "KITCHEN";
              break;
          case "ha":
              System.out.println("You turned on HALLWAY light");
              light = "HALLWAY";
              break;
          default:
              System.out.println("UNKNOWN selection");
              light = " Unknown";
              break;
      }

          System.out.println("Your selection:"+ light);








    }
}
