package day25;

import java.util.Arrays;

public class FindLongestWord {
    public static void main(String[] args) {
        String sentence=" We are trying to find longest word";

        String[] allWords= sentence.split(" ");
        System.out.println("allWords "+ Arrays.toString(allWords));

        String longestWord="";
        int maxCharCount= 0;
        // first creat a variable
        //also create maxCharCount
        // i waant to go thought each and every character in string array
        //and check whether the length of current word is more than longestWord
        //if it is i will assign the new longest word value to current word i am looking at

        for (String currentWord:allWords) {
         //   System.out.println("currentWord "+currentWord);
            if ( currentWord.length()> longestWord.length()){
                longestWord=currentWord;
            }

        }
        System.out.println("Longest word = "+ longestWord);
    }
}
