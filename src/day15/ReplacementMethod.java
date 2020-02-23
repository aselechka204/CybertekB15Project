package day15;

import jdk.swing.interop.SwingInterOpUtils;

public class ReplacementMethod {
    public static void main(String[] args) {
        String message = "I love Pumpkin, Pumpkin is Fun!";
       message = message.replace("Pumpkin", "Java!");
        System.out.println(message);

        // what if i want to replace space from everywhere

        String message2="HAPPY THANKS GIVING TO ALL!!!!";
        message2=message2.replace("THANKS GIVING", "THANKSGIVING");
        System.out.println(message2);



    }
}
