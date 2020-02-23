package day27;

public class ArrayPractice2 {
    public static void main(String[] args) {


        int[] num={100, 10000, 9999, 8888, 1231, 2345};
        int max=num[0];


        for(int i=0; i<num.length; i++){
            if(max<num[i]){
                max=num[i];

            }
        }
        System.out.println("first max number " + max);

        int secondMax=num[0];
        for (int i = 0; i <num.length ; i++) {
            if(secondMax<num[i]&& num[i]!=max){
                secondMax=num[i];
            }
        }
        System.out.println("second "+secondMax);
    }
}
