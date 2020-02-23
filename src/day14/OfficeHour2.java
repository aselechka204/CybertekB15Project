package day14;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class OfficeHour2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("You want food or not?");

        String mainOption = scan.next();
        String secondaryOption = scan.next();

        if(mainOption.equalsIgnoreCase("food")) {
            System.out.println("You have selected food");

            System.out.println("You want meal or snack?");


          if(secondaryOption.equalsIgnoreCase("snack"));
            System.out.println("You have selected snack");

        } else if(secondaryOption.equalsIgnoreCase("meal")){

            System.out.println("You have selected meal");

        } else

            System.out.println("no such food option");









    }
}
