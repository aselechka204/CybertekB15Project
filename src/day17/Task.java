package day17;

public class Task {
    public static void main(String[] args) {


        String name2= "Damir Gazizov";
        int lastChar= name2.length()-1;

        while(lastChar >= 0 ){

                System.out.println("index " + lastChar + " : "+ name2.charAt(lastChar));

            --lastChar;
            }


    }
}
