package day16;

public class Loop {
    public static void main(String[] args) {


        //Print hello world 3 times
        int helloWorld = 1;

            System.out.println("Hello World");
            // count = count+1;
            //count +=1;


        ++helloWorld  ;

        System.out.println("Hello World");
        ++helloWorld;
        System.out.println("Hello World");
        ++helloWorld;
        System.out.println("Hello World");
        ++helloWorld;
        System.out.println("Hello World");

        System.out.println("Count is " + helloWorld);

        System.out.println("-----------------");


        int cnt=1;
        while(cnt<=5){
            System.out.println("Hello");
            System.out.println("cnt value is "+cnt);
            ++cnt;

          // check this 1<=5 --> true
            // 2<=5 -->true
            // 3<=5 -->true
             //4<=5 -->true
            //5<=5 -->true
            //6<=5-->false GET OUT OF THE LOOP
        }






    }
}
