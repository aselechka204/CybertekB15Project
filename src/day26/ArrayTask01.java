package day26;

public class ArrayTask01 {
    public static void main(String[] args) {

        int[] scores={156, 101, 76, 187, 87, 110};

        String finalResult="";

        int countOfLessThan100=0;

        for ( int eachNum:scores){

            if(eachNum<=100){
                System.out.println("eachNum "+ eachNum);
                countOfLessThan100++;
            }

        }
        System.out.println("count ="+ countOfLessThan100);
        if(countOfLessThan100>0){
            finalResult="No";

        }else{
            finalResult="Yes";
        }
        System.out.println("FinalResult= "+ finalResult);

    }
}
