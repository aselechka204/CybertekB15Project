package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {

        String students = "Abbos,Zulyar, Zhibek, Hasan,Muge,Orhan,Susan";
        students = students.replace(" ", "");
        String[] namesArrays1 = students.split(",");
        System.out.println(Arrays.toString(namesArrays1));
        System.out.println("length of namesArrays1 is " + namesArrays1.length);

        int studentCount= namesArrays1.length;
        for (int i = 0; i <studentCount ; i++) {
            String name = namesArrays1[i];
            System.out.println("Spelling = "+ name);

            for (int j = 0; j < name.length(); j++) {
                System.out.print(name.charAt(j)+" - ");

            }
            System.out.println();

        }
// this one is longer way to get 1 name out of the string
        String name = namesArrays1[1]; //Z U L Y A R
        for (int x = 0; x < name.length(); x++) {
            System.out.print(name.charAt(x) + "-");

        }
        System.out.println();
        String name2 = namesArrays1[2]; //Z H I B E K
        for (int x = 0; x < name2.length(); x++) {
            System.out.print(name2.charAt(x) + "-");


        }
        System.out.println();
        String name3 = namesArrays1[3]; //H A S A N
        for (int x = 0; x < name3.length(); x++) {
            System.out.print(name3.charAt(x) + "-");
        }



    }
}
