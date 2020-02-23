package day35;

public class CharacterPractice {
    public static void main(String[] args) {
        //Character class has lots of static method

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));


        String str= "A34B123C4X";
        String result="";
        for (int x = 0; x <str.length() ; x++) {

            if(Character.isDigit(str.charAt(x) )  ){
                System.out.println("str.charAt("+x+") ="+ str.charAt(x));
                result+=str.charAt(x);
            }
        }
        System.out.println("result = " + result);
        Integer num= Integer.valueOf(result);
        System.out.println("num "+num);




    }
}
