package day32;

public class NumberAction {
    public static void main(String[] args) {
        numberComparison(20,25);
      skipCountby3();
      countDownByEven();
      print1toX(50);
      repeater("Asel",5);


    }

    public static void numberComparison(int num1, int num2){

        if(num1>num2){
            System.out.println(+num1+" num1 is more than num 2 "+num2);
        }else if(num1<num2){
            System.out.println(+num2+" num2 is more than num1 "+num1);
        }else if(num1==num2){
            System.out.println(num1+" they are equal "+num2);
        }
        System.out.println();
    }

    public static void skipCountby3(){
        for (int x = 0; x < 50; x++) {
            if(x%3==0){
                System.out.print(x+" ");
            }

        }
        System.out.println();
    }

    public static void countDownByEven(){
        for (int x = 50; x >0 ; x--){
            if(x%2==0){
                System.out.print(x+" ");
            }
        }
        System.out.println();
    }
    public static void print1toX(int x){
        for (int i = 1; i <= x ; i++) {
                System.out.print(i +" ");
            }
        System.out.println();
        }



    public static void repeater(String stringRepeat, int count){

        for (int x =1 ; x <=count; x++) {

            System.out.print(stringRepeat+", ");
        }
        System.out.println();
    }
}
