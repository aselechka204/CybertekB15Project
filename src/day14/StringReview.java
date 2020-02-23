package day14;

public class StringReview {
    public static void main(String[] args) {
        String str = "I like Pumpkin";
        System.out.println(str.equals("I like Pumpkin"));

        // contains:
        // it checks whether a string exists in another string
        //and return true or false result
        System.out.println(" does it contain a word Pumpkin : ");

        System.out.println( str.contains("Pumpkin")  );
        // true 
        boolean gotPumpkin = str.contains("Pumpkin");
   /// shortcut to print variable value in nice format
        System.out.println("gotPumpkin = " + gotPumpkin);
        System.out.println("gotPumpkin = " + gotPumpkin);

        //STARTSWITH ENDSWITH
        //Check whether a string starts with another string or ends with another string 
        //return true or false 

     boolean startWithI = str.startsWith("I");
        System.out.println("startWithI = " + startWithI);
        
        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);

        // password validator
        // min 8 char max 16
        // it must contain _ or $
        // it must not contain space
        // it must start with AB
        //if any of the above condition does not match say Invalid Password
        // else say good password@


        String password = "ASH2723gfdfij";
        boolean min8max16= password.length()>=8 && password.length() <=16;
        boolean mustContains_or$ = password.contains("_") || password.contains("$");
        // it must not contain space
        boolean mustNotContainSpace= ! password.contains(" ");
        boolean mustStartWithAB = password.startsWith("Ab");


        if(min8max16 &&mustContains_or$ && mustNotContainSpace&&mustStartWithAB){
            System.out.println("VALID PASSWORD");
        } else{
            System.out.println("INVALID PASSWORD");
        }


    }
}
