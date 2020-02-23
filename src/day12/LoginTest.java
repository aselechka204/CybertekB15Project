package day12;

public class LoginTest {
    public static void main(String[] args) {
        String userName = "user123";
        String password = "pass123";


        if (userName.equals("user123") && password.equals("pass123")){
            System.out.println("Log in successful!!");
        } else if(!userName.equals("user123")){
            System.out.println("Check your user name");
        } else if (!password.equals("pass123")){
            System.out.println("Check your password");
        }

    }
}
