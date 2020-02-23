package day33;



public class NumberActions {
    public static void main(String[] args) {

        System.out.println(getSumFrom1toX(6));

        System.out.println(build_Got_Email("Araya", "Stark"));

        String fullName="Susan cure";
     //   String firstPart=fullName.split(" ")[0];
     //   String secondPart=fullName.split(" ")[1];
    //    String herEmail=build_Got_Email(firstPart,secondPart);
        String[]fullNameSplit=fullName.split(" ");
        String herEmail=build_Got_Email(fullNameSplit[0],fullNameSplit[1]);
        System.out.println(herEmail);




    }


    public static String build_Got_Email(String firstName, String lastName ){


    String email= firstName.charAt(0)+lastName+"@NightWatch.com";
        return email;


    }
    public static int getSumFrom1toX(int outcome){
         int sum= 0;
        for (int i = 1; i <=outcome ; i++) {
            sum=sum+i;
            
        }
        
        return sum ;

    }
}
