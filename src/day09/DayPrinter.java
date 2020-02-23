package day09;

public class DayPrinter {
    public static void main(String[] args) {

       int dayCode = 5;
           String dayName = " "; // assigning a empty String value
            dayName = "Monday";


           if (dayCode ==1) {
               dayName = "Monday";
              // System.out.println("Today is  MONDAY!");

       } else if ( dayCode==2){

           dayName = "Tuesday";
          // System.out.println("Today is TUESDAY!");

       } else if ( dayCode==3){
           dayName = "Wednesday";
          // System.out.println("Today is WEDNESDAY!");

       } else if (dayCode ==4){
           dayName = "Thursday";
         //  System.out.println("Today is THURSDAY!");

       } else if (dayCode==5){
           dayName = "Friday";
         //  System.out.println("Today is FRIDAY!");

       } else if (dayCode==6){
           dayName = "Saturday";
         //  System.out.println("Today is SATURDAY!");

       } else if (dayCode==7){
           dayName = "Sunday";
         //  System.out.println("Today is Sunday!");
       } else {
           dayName = "Unknown";
         //  System.out.println("Day is UNKNOWN");
       }
        System.out.println("Day is " + dayName);



    }
}
