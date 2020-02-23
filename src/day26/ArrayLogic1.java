package day26;

public class ArrayLogic1 {
    public static void main(String[] args) {

        int[] scores={156, 101, 76, 187, 87, 110};

        String finalResult="";

        int countMoreThan100=0;
        int size=scores.length;

        for ( int eachNum:scores){

            if(eachNum>100){
                ++countMoreThan100;

            }
        }
        System.out.println(countMoreThan100);
        //if all the numbers are more than 100, it will have same count as item count
        if(countMoreThan100== scores.length){
            finalResult="yes";
        }else{
            finalResult="no";
        }
        System.out.println("Final Result "+ finalResult);

        }
}
