package day15;

public class NameChecker {
    public static void main(String[] args) {
        String nameCheck = "Aseliya";



        if(nameCheck.length()<4){
            System.out.println("Short Name Asel");
        } else if (nameCheck.length()>4 && nameCheck.length()<11){
            System.out.println("Medium Name");
        } else if(nameCheck.length()<=11){
            System.out.println("Print Longer Name");
        }

      if(nameCheck.contains("a") || nameCheck.contains("e")){
          System.out.println("Your name contains a or e or both");
      } else {
          System.out.println("I don't have either of the letters");
      }

    }
}
