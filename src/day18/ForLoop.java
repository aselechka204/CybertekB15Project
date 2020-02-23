package day18;

public class ForLoop {
    public static void main(String[] args) {

        for( int x=0 ; x<100; x+=2){
            System.out.println("Even number"+x);
        }
        for (int i = 0; i <100 ; i++) {

            if(i%2==0){
                System.out.println(i+" ");
                // the shortcut generating for loop is fori tab

            }

        }
        System.out.println("-------------");

        for (int i = 0; i < 100; i++) {
            if(i%5==0 && i % 3==0){
                System.out.println(i+"Fizz Buzz Number ");
            }

        }
        // everything you can do with the forloop ---> can be done using while loop!!!
    }
}
