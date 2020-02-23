package day34;

public class MoreMethodPractice {

    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));


        //method that return both monkeys that are smiling or not smiling
        //
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){

       // return aSmile==bSmile ;
      //  if(aSmile&&bSmile || !aSmile && !bSmile){
      //      return true;
     //   }else{
      //      return false;
      //  }

        return (aSmile &&bSmile || (!aSmile&&!bSmile));
    }
}
