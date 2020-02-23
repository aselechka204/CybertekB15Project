package day21;

public class DecidingWhenToStop {
    public static void main(String[] args) {
        String msg="Hello World";
        int charCount= msg.length();
        int countOfCharToIterate = msg.length();
        int n = 7;

        // x<= charCount-n

        for (int i = 0; i <=charCount-n ; i++) {
            System.out.println(msg.substring(i,i+n));

        }
    }
}
