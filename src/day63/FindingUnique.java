package day63;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindingUnique {
    public static void main(String[] args) {

        String str= "The new link for joining class will require you to login to Okta, if it ask you to sing in"+
                ", please just click on it , it will take you to Okta sign in page, once you sign in with Okta."+
                "Then you will be able to join right awya. Plese DO NTO TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL"+
                "click to join";

        //how many unique character showed up in the above sentence;

        // first create a hashset object with type Character
        //iterate over each character in above String
        //then add it to the hashset so it can remove the duplicate for us

        Set<Character> charSet= new LinkedHashSet<>();
        for (int x = 0; x <str.length() ; x++) {
            charSet.add(str.charAt(x));

        }
        System.out.println("How many character overall?"+str.length());
        System.out.println("How many Unique Characters?"+charSet.size());
        System.out.println("charSet= "+ charSet);

        for (Character eachChar: charSet) {
            System.out.println("each unique Char="+ eachChar);
        }
    }
}
