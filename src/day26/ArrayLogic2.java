package day26;

public class ArrayLogic2 {
    public static void main(String[] args) {

        int[] scores={156, 101, 76, 187, 87, 110};


        int countOfLessThan100=0;
        int size=scores.length;
        System.out.println("size"+size);


        String finalResult="YES";

        for (int eachNum  : scores){
            if(eachNum<=100){
                finalResult="NO";
                break;
            }
        }
        System.out.println("Final Result= "+finalResult);
    }
}
