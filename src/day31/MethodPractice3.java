package day31;

public class MethodPractice3 {
    public static void main(String[] args) {


        countDown();
        oddNumbers();
        nameSpell();

            }



    public static void countDown() {
        for (int i =20; i >0 ; i--) {
            System.out.print(i+" ");
        }


        System.out.println();

    }

public static void oddNumbers(){
    for (int x = 1; x <=100 ; x++) {
        if (x % 2 == 1) {
            System.out.print(x+" ");
        }

    }
    System.out.println();
}
public static void nameSpell(){
       String name= "Aseliya";

    for (int x = 0; x <name.length() ; x++) {
        System.out.print(name.charAt(x));

    }
}


}

