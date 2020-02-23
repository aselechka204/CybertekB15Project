package day09;

public class SwitchStatementPrictice2 {
    public static void main(String[] args) {
        int languageCode = 1;
        String greeting = "";


        switch( languageCode) {

            case 1:
                greeting = "Privet";
                break; // use it to get out of this branch
            case 2:
                greeting = "Salam";
                break;
            case 3:
                greeting = "Hello";
                break;
            case 4:
                greeting = "Merhaba";
                break;
            case 5:
                greeting = "Aloha";
                break;
            case 6:
                greeting = "Hola";
                break;
            case 7:
                greeting = "Bonjour";
                break;
            default:
                greeting = "Language unknown";
        }
        greeting = greeting +languageCode;
        System.out.println("Greeting SDET -"+ greeting);


    }
}
