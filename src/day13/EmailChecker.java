package day13;

public class EmailChecker {
    public static void main(String[] args) {
        //create a variable called email
        // check for bellow conditions
        //if it does not contain character @say invalid email

        // if it ends with   @gmail.com ---> gmail
        // if it ends with @yahoo.com ---> yahoo mail
        // if it ends with @mail.ru --> russian email

        String email = "abc@mail.ru";





        if(!email.contains("@") ||email.contains(" ")){
            System.out.println(" its invalid");
        } else if( email.endsWith("@gmail.com")){
            System.out.println("GOOGLE EMAIL");
        }else if(email.endsWith("@yahoo.com")){
            System.out.println("YAHOO MAIL");
        }else if(email.endsWith("@mail.ru")){
            System.out.println("RUSSIAN EMAIL");
        }else{
            System.out.println("Unknown selection");
        }

    }





}
