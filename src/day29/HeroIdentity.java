package day29;

import java.util.Arrays;

public class HeroIdentity {
    public static void main(String[] args) {
        String hero1="Superman-Clark J Kent";
        String[] heroX= hero1.split("-");
        System.out.println(Arrays.toString(heroX));
        String heroCode=heroX[0];
        String fullName=heroX[1];

        int nameCharCount=fullName.length();
        String stars="";
        for (int x = 0; x <nameCharCount ; x++) {
            stars=stars+"*";

        }

        System.out.println(fullName);
        System.out.println(heroCode+stars);

        String hero=hero1.replace(fullName, stars);
        System.out.println(hero);


        }
    }

