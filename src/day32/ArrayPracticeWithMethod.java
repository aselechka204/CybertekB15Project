package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {
        //this is passing the array object directly into the method
  arrayPrinter( new int[]{1,6,7,5,3,12});

  // this is assigning the array object into a variable
        // and than pass it into the method

  int[]scores={2,5,8,23,4,5,6,};
arrayPrinter(scores);
printMaxOfIntArray(scores);
printMinOfArray(scores);
printSumOfIntArray(scores);

twoArrayAsParameter(new String[]{"Asel", "Alan", "Adam", "Damir"}, new String[]{"Mama"});
String[]names1={"superman", "batman", "flash"};
String[]names2={"wonder woman", "cybog", "aquaman"};
twoArrayAsParameter(names1, names2);
    }

    //create a method that has one int array as a parameter
    // array printer
    // print out each item in this format
    //arrays has items:--->>>> all the items


    public static void arrayPrinter(int[] nums){
        System.out.println("arrays has items: "+ Arrays.toString(nums));


    }

    public static void printMaxOfIntArray(int[] maxNum){


        int max=maxNum[0]; // max
        for (int i = 0; i <maxNum.length ; i++) {
            if(max<maxNum[i]){
                max=maxNum[i];
            }
        }
        System.out.println("max= "+max);

    }
    public static void printMinOfArray(int[] maxNum) {
        int min = maxNum[0]; // max
        for (int i = 0; i < maxNum.length; i++) {
            if (min > maxNum[i]) {
                min = maxNum[i];
            }
        }
        System.out.println("min= "+min);
    }

    public static void printSumOfIntArray(int[] maxNum){
        int sum= 0;
        for ( int each:maxNum) {
            sum=sum+each;

        }
        System.out.println("sum= "+sum);

    }

    public static void twoArrayAsParameter(String[] oneArray, String[] twoArray){
        if(oneArray.length>twoArray.length){
            System.out.println("array 1 has more items");
        }else if(oneArray.length<twoArray.length  ){
            System.out.println("array 2 has more items");
        }else{
            System.out.println(" they have the same count");
        }


    }
}
