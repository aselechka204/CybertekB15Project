package day22;

public class ArrayIntro {
    public static void main(String[] args) {

        int num1=10;
        //syntax for creating variable to store single item
        /*
        assign value
        dataType variableName= value here

        sytax for creating variable to store multiple itemms
        and assign values
        dataType[] variableName=new dataType [count of item];
         */

        int [] scores = new int [4];
        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;

        System.out.println(scores[0]);
        System.out.println(scores[1]);

        System.out.println(scores[2]);
        System.out.println(scores[3]);

        // updating the value at certain index
        scores[1]=99;
        System.out.println(scores[1]);
        // once array is created with certain size, we cannot change the size
        // when you creat new array object
        // it will get default value in each element
        int[] numbers=new int [3];

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        int [] bite= new int [4];
        bite[0]=24;
        bite[1]=25;
        bite[2]=26;
        bite[3]=27;


        System.out.println(bite[0]);
        System.out.println(bite[1]);
        System.out.println(bite[2]);
        System.out.println(bite[3]);

        bite[1]=50;

        System.out.println(bite[1]);

    }
}
