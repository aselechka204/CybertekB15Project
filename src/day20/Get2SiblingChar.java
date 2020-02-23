package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {


        String name = "Ayra";
        // ay
        // yr
        // ra

        int charx = name.length()-1;


        for (int x = 0; x <= charx-1; x++) {

            System.out.println(name.substring(x,x+2));

        }


    }
}
