package day36;

public class MethodWithParameters {
    public static void main(String[] args) {

    //    add100(25);

      //  int num = 7;
    //       add100(num);
    //       add100(25);
        int num =10;
        add100(num);
        System.out.println(num);
    }

    public static void add100(int x){
        x= x+100;
        System.out.println(x);
    //    System.out.println(x+100);
    }
}
