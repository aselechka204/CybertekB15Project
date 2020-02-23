package day34;

public class LogIn {
    public static void main(String[] args) {

      logInVoid("my username", "abc123");
        logInVoid("user", "abc123");

         boolean result =logIn2("user", "abc123");
        System.out.println("result="+result);
        System.out.println("Second run "+ logIn2("aaaa","bbb"));




        if(logIn2("user","abc123")){
            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View the order");
        }else{
            System.out.println("No shopping unless you signed in");
        }


    }

    private static void logInVoid(String my_username, String abc123) {
    }

    public static void logIn1(String user, String password) {
        if(user.equals("user")&& password.equals("abc123")){
            System.out.println("Log In Successful");
        }else{
            System.out.println("Log In Failed");
        }


    }

    public static boolean logIn2(String user, String password) {

  //  if( user.equals("user") && password.equals("abc123")){
  //      return true;
  ////  }else{
  //      return false;
  //  }
     return  user.equals("user") && password.equals("abc123");  // user shorter code
    }
}
