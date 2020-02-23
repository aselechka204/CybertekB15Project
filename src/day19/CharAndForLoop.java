package day19;

import jdk.swing.interop.SwingInterOpUtils;

public class CharAndForLoop {
    public static void main(String[] args) {


        //  int x = 'A';
        char myChar = 'A'; //d

        //  System.out.println(x);
        System.out.println(myChar);

        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);

        System.out.println('A' > 'B');
        ; // 65>66
        System.out.println('Z' > 'B'); // z has  bigger number


        for(char iChar = 'A';iChar <='Z';iChar ++){
        System.out.println(iChar);
    }
}
    }

