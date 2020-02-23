package day33;

public class MethodWithReturnPractice2 {
    public static void main(String[] args) {

        covertNumberToDay(5);
        covertNumberToDay(6);
        covertNumberToDay(8);

        System.out.println(covertNumberToDay(8));

        int[] allCodes={5,3,11,4,33};
        for (int x = 0; x <allCodes.length ; x++) {
            String day= covertNumberToDay(allCodes[x]);
            System.out.println("day= "+day);

        }
        System.out.println("---------");
        for (int eachCode:allCodes) {
            System.out.println("each day= "+ covertNumberToDay(eachCode));

        }

      //  System.out.println("day="+day);
    }

    public static String covertNumberToDay (int dayCode){
        String day=" ";
      switch(dayCode){
          case 1:
              day="Monday";
              break;
          case 2:
              day="Tuesday";
              break;
          case 3:
              day="Wednesday";
              break;
          case 4:
              day="Thursday";
              break;
          case 5:
              day="Friday";
              break;
          case 6:
              day="Saturday";
              break;
          case 7:
              day="Sunday";
              break;
          default:
               day="Funday";



      }

        return day ;
    }
}
