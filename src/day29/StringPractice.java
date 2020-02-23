package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String hero1="Superman-Clark Kent";

        String[] heroSplitted=hero1.split("-");
        System.out.println(Arrays.toString(heroSplitted));
        String heroCode=heroSplitted[0];
        String fullName=heroSplitted[1];
        System.out.println("hero code is "+heroCode+" and identity is "+ fullName);

      String[] fullNameSplitted=fullName.split(" ");
        System.out.println("Full name split "+ Arrays.toString(fullNameSplitted));
        String lastName= fullNameSplitted[fullNameSplitted.length-1];
        System.out.println("last name "+ lastName);
        System.out.println("Initial of the hero is "+ fullName.charAt(0)+lastName.charAt(0));

        }
    }

