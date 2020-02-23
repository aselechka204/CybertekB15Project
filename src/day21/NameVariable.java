package day21;

import java.util.Spliterator;

public class NameVariable {
    public static void main(String[] args) {

        String name = "Asel Aidarbekova";
         int charx=name.length();
        for (int i = 0; i <charx ; i++) {
            char currentChar =name.charAt(i);
            System.out.println(currentChar);

            if(currentChar=='b'){
                System.out.println("Found it!");
                break;

            }


        }

    }
}
