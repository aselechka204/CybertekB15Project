package day09;

public class InitializingAVariable {
    public static void main(String[] args) {

        int languageNumber = 5;

        String languagePicker = "";
        System.out.println("Welcome to Cybertek");
        System.out.println("Please select your language option from 1-7");

        languagePicker = "Hello";

        if (languageNumber == 1){
            languagePicker = "HELLO";
        } else if (languageNumber==2){
            languagePicker ="SALAM";
        } else if (languageNumber==3){
            languagePicker = "HOLA";
        } else if (languageNumber==4){
            languagePicker = "PRIVET";
        } else if (languageNumber==5){
            languagePicker = "MERHABA";
        } else if (languageNumber==6){
            languagePicker = "Szia";
        } else if (languageNumber==7){
            languagePicker= "Bojour";
        } else {
            languageNumber = 8;

        }
        System.out.println(" Greetings SDET"+languagePicker);

    }
}
