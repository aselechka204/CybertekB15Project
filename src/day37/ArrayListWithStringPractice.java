package day37;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Wonder Woman");
        superHeros.add("Cyborg");
        superHeros.add("Aquaman");
        superHeros.add("Flash");


        System.out.println("superheros=" + superHeros);

        System.out.println("superheros.contains(\"Superman\")=" + superHeros.contains("Superman"));
        System.out.println("superheros.contains(\"man\")=" + superHeros.contains("man"));


        for (int i = 0; i < superHeros.size(); i++) {
            String currentHero = superHeros.get(i);
            if (!currentHero.contains("man")) {
                superHeros.remove(currentHero);

                //once hero is removed this index will be filled by next item
                //so we need to decrease the index by 1 so stay at same index
                i--;
            }

        }
        System.out.println("superheros "+ superHeros);
    }
}
