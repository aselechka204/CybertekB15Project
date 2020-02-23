package day21;

public class SearchingSomethingInString {
    public static void main(String[] args) {
        String myName = "Amelia Amelia Amelia ";

        int charCount= myName.length();
        System.out.println("Char Count"+charCount);
        int lastCharIndex=charCount-1;
        System.out.println("lastCharIndex= "+lastCharIndex);

        int counter = 0;

        System.out.println("----3 char----");

        for (int i = 0; i <=lastCharIndex-2 ; i++) {
        //    System.out.print(myName.substring(i,i+1)+"->");


            String currentChar=myName.substring(i,i+3);

            if(currentChar.equalsIgnoreCase("lia")){
                System.out.println("The index of lia is"+i);

                counter = counter +1;
                // counter +=;
                //counter ++;

            }



        }

        System.out.println("last char index ="+ lastCharIndex);

         /*
            find out index of all the letter a in cases insensitive nanner
            i will go through each and every letter of the string
            -->> each character i can use substring (01) and so on
            --> going to 0 to last index -->> for loop

            while i am going through each and every character
            i will check whether current character i am looking at
            equals to a or A --> currentCharacter.equalsIgnoreCase("a")
            if it is i will print the index println (the variable you use to keep the index)
            if not -->> just move on
            perform this action until i reach last character if i go over last character index i stop
             */
    }
}
