package day16;

public class StringPractice {
    public static void main(String[] args) {
        //given a sentence with 3 words
        // get the second word

        // steps:
        //second word is between first space and last space
        // getting string inside another string by begining end index
        //                0123456789012345678
        String sentence ="You understand Java";
        String secondWord;
        int firstSpaceIndex= sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = "+ firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("last space index "+ lastSpaceIndex);
        System.out.println(sentence.substring(1+1,6));
        secondWord= sentence.substring(firstSpaceIndex+1,lastSpaceIndex   );
        System.out.println("secondWord="+secondWord);


        String firstWord = secondWord.substring(0,firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);

        // how to get last word from any sentence
        // last word in a sentence means from last space till the rest
        String lastWord= sentence.substring(lastSpaceIndex+1);
    }
}
