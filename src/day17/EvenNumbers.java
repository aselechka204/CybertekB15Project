package day17;

public class EvenNumbers {
    public static void main(String[] args) {
        int count = 21;

        while(count<=50){

            if (count%2==0){

                System.out.println(count+"is even number");
            }else{
                System.out.println(count+"is odd number");
            }
            ++count;
        }

    }
}
