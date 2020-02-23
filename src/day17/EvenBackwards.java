package day17;

public class EvenBackwards {
    public static void main(String[] args) {
        int even = 100;

        while(even>=0) {

            if (even % 2 == 0) {
                System.out.println("Even numbers "+even);

            }
            --even;


        }

    }
}
