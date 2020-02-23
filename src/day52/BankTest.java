package day52;

public class BankTest {

    public static void main(String[] args) {

        Account a1= new Account("John Snow", 10000);
        Account a2= new Account("Abba", 7000);

        System.out.println("a1= "+ a1);
        System.out.println("a2= "+ a2);

       a1.transferAll(a2);

        System.out.println("a1= "+ a1);
        System.out.println("a2= "+ a2);


        System.out.println("is name Palindrone John Snow "+a1.isPalindrome());
        System.out.println("is name Palindrome Abba "+a2.isPalindrome());

    }
}
