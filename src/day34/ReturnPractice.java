package day34;

public class ReturnPractice {
    public static void main(String[] args) {

        printMin4CharLengthName("Aselya");
        printMin4CharLengthName("kuk");


    }

    public static void printMin4CharLengthName(String name){

        if(name.length()<4){
            System.out.println("Invalid Name!!!");
            return ;
        }
        System.out.println(name);
    }
}
