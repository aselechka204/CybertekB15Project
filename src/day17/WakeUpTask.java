package day17;

import jdk.swing.interop.SwingInterOpUtils;

public class WakeUpTask{
    public static void main(String[] args) {
        //             012345
        String name = "ASELYA";
      //String name2= (name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase());
        String name2 = (name.charAt(0)+"").toUpperCase();
        name2=name2+name.substring(1).toLowerCase();
        System.out.println(name2);



    }
}
