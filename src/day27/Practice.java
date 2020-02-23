package day27;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        int num=10;
        int[] arr={10, 20, 30, 40, 50, 60};

        int num1=arr[arr.length-1];

        System.out.print(num1);

        System.out.println();

        for (int x = 0; x <arr.length ; x++) {
            System.out.println(arr[x]+" ");

            //Arrays.toString();
            System.out.println();

            String str= Arrays.toString(arr);
            System.out.println(str);

            int[] numbers= new int[5];
            System.out.println(Arrays.toString(numbers));

        }
    }
}
