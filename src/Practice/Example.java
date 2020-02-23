package Practice;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        sender = message.substring(message.indexOf("<"),message.indexOf(">"));
        System.out.println(sender);






    }
}
