package day31.day33;

public class WarmUp {
    public static void main(String[] args) {

   String spelledName=getSpelledName("Sierra");
        System.out.println(spelledName);

        System.out.println(getSpelledName("Aseliya"));

        System.out.println(getSpelledName2("Damirchik"));

    }


    public static String getSpelledName2(String name){

        String result= "";

        for (int x = 0; x <name.length()-1 ; x++) {
            result+=name.charAt(x)+"-";
        }

        return result+name.charAt(name.length()-1);


    }

    public static String getSpelledName(String name){

        String result="";
        for (int x = 0; x <name.length() ; x++) {
            result=result+name.charAt(x);
            if(x!=name.length()-1){
                //concatenate dash- if we are not at last character
                result=result+"-";
            }
        }

        return result;
    }
}
