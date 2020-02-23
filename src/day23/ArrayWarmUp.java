package day23;

public class ArrayWarmUp {
    public static void main(String[] args){
        //create an int array of 7 items
        /*assign values
        1,print out in reverse order
        2, store last item in a variable called last item, print it out seperatly
        3 print the item right in the middle
        optionally find sum find average find max find min


         */


        int[] array= new int[]{10,20,30,40,50,60,70};
   //     int [] array= new int [7];

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);


     int reverse=array.length-1;

        for (int i = reverse; i >= 0 ; i--) {

            System.out.println(array[i]);


        }
        int arraySize=array.length;
        int lastItemIndex=arraySize-1;
        int lastItemValue=array[lastItemIndex];
        System.out.println("last item value ="+ lastItemValue);

        int middleItemIndex=arraySize/2;
        System.out.println("middle item value ="+array[middleItemIndex]);

        int sum = 0;

        for (int x = 0; x <arraySize ; x++) {
            int currentItem=array[x];
            sum=sum+currentItem;

        }
        System.out.println("sum= "+sum);
    }
}


