package day20;

import java.util.jar.JarOutputStream;

public class ReversingAString {
    public static void main(String[] args) {
        String name= "Asel Aidarbekova";
        String reversedName= " ";

      int lastCharIndex= name.length()-1;


        System.out.println(name.charAt(7)  );
        System.out.println(name.charAt(6)  );
        System.out.println(name.charAt(5)  );
        System.out.println(name.charAt(4)  );
        System.out.println(name.charAt(3)  );
        System.out.println(name.charAt(2)  );
        System.out.println(name.charAt(1)  );
        System.out.println(name.charAt(0)  );

        System.out.println( );


        for (int x = lastCharIndex; x >=0 ; x--){
            System.out.print( "index: "+x);
            char currentChar=name.charAt(x);
            System.out.println(currentChar);
          //  System.out.print(name.charAt(x));

            reversedName=reversedName+currentChar;


        }
        System.out.println("The reversed name is = "+reversedName);
    }
}
