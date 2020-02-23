package day22;

public class WakwUpTast {
    public static void main(String[] args) {

        String msg = "I struggle with Java I Like Java I love Java Everything is Awesome!";
        int len = msg.length();
        System.out.println("Character count = " + len);


        for (int i = 0; i <= len; i++) {

            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i + "  :   " + msg.substring(i, i + 1));

        }
// task 2
        for (int x = 0; x <= len; x++) {
            String currentChar = msg.substring(x, x + 1);

            if (currentChar.equalsIgnoreCase("j")) {
                break;


            }
            System.out.println("Current Char " + currentChar);


        }

    }

}
