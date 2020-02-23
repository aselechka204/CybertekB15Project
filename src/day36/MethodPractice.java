package day36;

public class MethodPractice {
    public static void main(String[] args) {

       Boolean result1= checkIfStringHasNumber("ytz13ck");
        System.out.println("result1="+result1);
        Boolean result2=checkIfStringHasNumber("ABCD");
        System.out.println("result2= "+result2);

    }

    public static Boolean checkIfStringHasNumber(String str){

        for (int i = 0; i <str.length() ; i++) {
            char eachChar=str.charAt(i);
            if(Character.isDigit(eachChar)){
                return Boolean.valueOf(true);
            }
        }
        System.out.println("No number found !!!");
        return Boolean.valueOf(false);
    }

}
