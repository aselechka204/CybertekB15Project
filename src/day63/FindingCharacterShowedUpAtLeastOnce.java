package day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindingCharacterShowedUpAtLeastOnce {
    public static void main(String[] args) {
        String str= "The new link for joining class will require you to login to Okta, if it ask you to sing in"+
                ", please just click on it , it will take you to Okta sign in page, once you sign in with Okta."+
                "Then you will be able to join right awya. Plese DO NTO TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL"+
                "click to join";

      //  Set<Character> chars= new HashSet<>(Arrays.asList('A','A','A','A','A'));
        Set<Character> chars= new HashSet<>(Arrays.asList( new Character[]{'A','A','A','A','A'}));
        System.out.println("chars="+ chars);
    }
}
