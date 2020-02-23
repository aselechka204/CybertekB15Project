package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {

        String name= "Alesya";
        // how would you sort each and every character
        // to an char array from above name
        //without using method we are about to learn
        char[] namesChar= new char[name.length()];

        namesChar[0]=name.charAt(0);
        namesChar[1]=name.charAt(1);


        for (int x = 0; x < namesChar.length; x++) {
            namesChar[x]=name.charAt(x);


        }
        System.out.println("namesChar = " + Arrays.toString(namesChar) );

        // TO GET CHAR METHOD CODE ON THE BOTTOM

        char[] namesChars2= name.toCharArray();
        System.out.println("namesChars2 "+ Arrays.toString(namesChars2));
    }
}
