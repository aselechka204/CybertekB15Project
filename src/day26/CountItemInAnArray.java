package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {

        String[] marvelHeros={"Iron Man", "Captain America", " Spiderman",
                "Black Panther", "Hulk", "Black widow", "Wanda", "Captain Marvel"};


        System.out.println("Marvel Heros =" + Arrays.toString(marvelHeros));
        int sizeOfArray= marvelHeros.length;
        System.out.println("Heros count="+ sizeOfArray);


        String itemToSearch= "Iron Man";
        int countOfItem=0;
        for(String eachHero: marvelHeros){
            if(eachHero.equalsIgnoreCase(itemToSearch)){
                countOfItem++;
            }

        }
        System.out.println(countOfItem);
        // count the hero with the name contains black


       int countofBlack=0;
       for(String eachHero:marvelHeros){
           if(eachHero.toLowerCase().contains("black")){
               countofBlack++;
           }
       }
        System.out.println("count of Black "+countofBlack);

    }
}
