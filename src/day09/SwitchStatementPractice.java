package day09;

public class SwitchStatementPractice {
    public static void main(String[] args) {
        int languageCode = 1;


        switch( languageCode) {

            case 1:
                System.out.println("Privet");
                break; // use it to get out of this branch
            case 2:
                System.out.println("Salam");
                break;
            case 3:
                System.out.println("Hello");
                break;
            case 4:
                System.out.println("Merhaba");
                break;
            case 5:
                System.out.println("Aloha");
                break;
            case 6:
                System.out.println("Hola");
                break;
            case 7:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Language unknown");
        }


        }
}
