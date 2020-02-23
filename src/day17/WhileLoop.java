package day17;

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 1;

        while (counter<= 5){
            System.out.print(counter);
            ++counter;
        }
        System.out.println();
        System.out.println("counter = "+counter); // at this point counter 6
//     it gived you 6 to get out of the loop because its false
        // how to get out of the string , count from 5 to 1

        while (counter >1 ){
            --counter;
            System.out.print    (counter+" ");

        }
    }
}
