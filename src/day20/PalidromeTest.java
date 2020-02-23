package day20;

public class PalidromeTest {
    public static void main(String[] args) {
        // if you reverse a string it does change it means
        // the string is called Palindrome

        String name = "kayak";

        String reversedName="";

        for (int i = name.length()-1; i >=0 ; i--) {
            reversedName=reversedName+name.charAt(i);

        }
        System.out.println("reversed name = "+reversedName);

        if(name.equalsIgnoreCase(reversedName)){

            System.out.println("Palindrome test has passed");
            }else{
            System.out.println("Palindrome test has failed");
        }
    }
}
