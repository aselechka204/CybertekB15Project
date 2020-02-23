package day15;

public class ReversingString {
    public static void main(String[] args) {
        String name = "Akbar";

        System.out.println(name.charAt(0)+" "+name.charAt(1)+" "+name.charAt(2)+" "+name.charAt(3)+" "+name.charAt(4)  );


        System.out.println(name.charAt(4)+" "+name.charAt(3)+" "+name.charAt(2)+" "+name.charAt(1)+" "+name.charAt(0)  );
     int nameLen = name.length();
     int lastChar = nameLen-1;
     char lastCharrr = name.charAt(lastChar);

        System.out.println("Last character is "+lastCharrr);

        System.out.println("Last char in one shot "+name.charAt(name.length()-1));
    }
}
