package day17;

public class OddNumber {
    public static void main(String[] args) {
        int x = 100;

        while(x>0){
            if(x%2!=0){
                // if x / 2 doesnt not have a remainder (5/2=2, 1 remainder)
                System.out.println(x+"is odd number");
            }
            --x;
        }
    }
}
