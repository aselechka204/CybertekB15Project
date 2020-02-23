package day14;

public class OfficeHour {
    public static void main(String[] args) {
        String mainOption = "Food";
        String secondOption = "meal";



        if (mainOption.equalsIgnoreCase("food")){
            System.out.println("You have selected food");
              if (secondOption.equalsIgnoreCase("snack")){
                  System.out.println("You have selected a snack");
              } else if (secondOption.equalsIgnoreCase("meal")){
                  System.out.println("You have selected a meal");

            } else{
                  System.out.println("No such food option");
              }

        }

    }
}
