package day35;

public class pRACTICE {
    public static void main(String[] args) {

        String sentence= "I bought 3 tomato and the price was 3,14 each";

        String[] allWords= sentence.split(" ");
        int count=Integer.parseInt(allWords[2]);
        String priceString=allWords[allWords.length-2];
        priceString=priceString.replace(",",".");

        double price= Double.parseDouble(priceString);
        System.out.println("Total price is = " +count*price);



        String patentSentence="You are seeing the first 2000 results for AIA Review Number: IPR";
        String[]allWords1=patentSentence.split(" ");
        int count1= Integer.parseInt(allWords1[5]);
        System.out.println(count1);
    }
}
