package day19;

public class FourLoop {
    public static void main(String[] args) {



        for (int i = 10; i < 45; i++) {
            System.out.println("Increase:"+i);
        }


        int start = 45;
        int end = 41;


        if(start<end) {
            System.out.println("Increase Speed");
            for (int i = start; i <= end; i++) {
                System.out.println(i + ",");

            }

        }else if(start>end){
            System.out.println("Decreasing Speed");
            for (int x = start; x >end ; x--) {
                System.out.println(x+",");
            }


        }else{
            System.out.println("NO ACTION NEDDED");

        }
    }
}
