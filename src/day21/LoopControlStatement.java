package day21;

public class LoopControlStatement {
    public static void main(String[] args) {

        //break
        //if line contains break reaches the loop will stop!!!

        //continue
        // if line contains break reaches the loop will skip to next iteration

    //    for (int i = 1; i <=10 ; i++) {
    //        System.out.println(i);
      //      break;
      //  }

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            if(i==5){
                break;
            }

        }

        int sum=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("final sum is "+ sum);
            System.out.println("if i add "+ i+ " dollar, it would be " + (sum+i));

            if(sum+i>=12){
                break;
            }
                sum = sum + i;

        }
        System.out.println("sum ="+sum);
    }
}
