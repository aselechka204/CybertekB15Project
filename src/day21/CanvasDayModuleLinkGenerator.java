package day21;

public class CanvasDayModuleLinkGenerator {
    public static void main(String[] args) {
        /*
        https://learn.cybertekschool.com/courses/278/modules#3318
         */


        String baseURL= "https://learn.cybertekschool.com/courses/278/modules#3318";
        String dayMsg= "This will lead you to day ";

     //   for (int moduleNumber = 3317; moduleNumber <=3317+35 ; moduleNumber++) {
      //      System.out.println(moduleNumber);

        for (int day = 21; day <=56 ; day++) {
            System.out.println(dayMsg+day);
            System.out.println(baseURL+(3317-21+day));

        }

        }

    }

