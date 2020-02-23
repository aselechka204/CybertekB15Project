package day27;

public class ArrayPractice1 {
    public static void main(String[] args) {

        int[] scores={100, 897, 654, 32,1231, 224, 556, 7, 1, 2, 3,4};
        int min=scores[0];// it will be replaced by 100
        for (int i = 0; i <scores.length ; i++) {
            if(min>scores[i]){
                min=scores[i];
            }

        }
        System.out.println("minimum number "+min);
        int secondMin=scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i]==min){
                continue;

            }
           if(secondMin>scores[i]){
               secondMin=scores[i];
           }
        }
        System.out.println("second min number is "+secondMin);
        int thirdMin=scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i]==min || scores[i]==secondMin){
                continue;
            }
            if(thirdMin>scores[i]){
                thirdMin=scores[i];
            }
        }
        System.out.println("thirs skip "+ thirdMin);
    }
}
