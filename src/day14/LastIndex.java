package day14;

import com.sun.security.jgss.GSSUtil;

public class LastIndex {
    public static void main(String[] args) {
        String name =  "Game of Java"; // 12 characters , length is 12, last char 11
        System.out.println("Find out last location the letter a shows up");
        System.out.println(name.lastIndexOf("a"));
        System.out.println("Find out last location the character space shows up");
        System.out.println(name.lastIndexOf(" "));
        System.out.println("Find out last location the letter GA shows up");
        System.out.println(name.lastIndexOf("Ga"));
        System.out.println("Find out last location the letter kawa shows up");
        System.out.println(name.lastIndexOf("Kawa"));


// if i dont use contains method , what would be mu condition to check
        // whether we have kawa in this string, either using IndexOf OF lastIndex

        if(name.indexOf("Kawa") >-1){
            System.out.println("Kawa found!!!");
        } else {
            System.out.println("No Kawa-NoPumpkin");
        }


    }
}
