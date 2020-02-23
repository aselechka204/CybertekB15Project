package day35;

public class CharacterPractice2 {
    public static void main(String[] args) {

        char myChar= '7';
        int myNum= Integer.parseInt(myChar+"");
        System.out.println("myNum= "+myNum);
        //Character.toString(myChar);
      //  String.valueOf(myChar);

        String str= "A34B123C4X";
        String result=" ";
       char[] allChars= str.toCharArray();
       int sum=0;
        for ( char each:allChars) {

            if (Character.isDigit(each)) {
                System.out.println("each digit " + each);
                 int eachNum=Integer.parseInt(each+"");
                 sum=sum+eachNum;
            }
        }


    }


}
