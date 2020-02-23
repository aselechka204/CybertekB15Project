package day25;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {
        String sentence= "I Love Java";

        //split is method of String that split string into multiple part
        // do i need to provide extra data while calling the method
        //

        String[] allWords = sentence.split(" ");
        System.out.println("all words "+ Arrays.toString(allWords));
        System.out.println("How many words do i have in this sentence? :"+ allWords.length);

        System.out.println("Last word in this sentence is "+ allWords[allWords.length-1]);

        // are we limited to split by space or we can split by anything ?---> ANYTHING

        String sentence2="Everything is Awesome!!! ";
        //split by letter e
        String[] splitByE= sentence2.split("e");
        System.out.println("Split by E "+Arrays.toString(splitByE));

        for (String eachPieces:splitByE) {
            System.out.println("Each Pieces=< "+ eachPieces+ ">");

        }
    }
}
