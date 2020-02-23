package day27;

public class MultiDimernsionalArray3D {
    public static void main(String[] args) {
        int[][] numbers={{12, 11, 10, 19}, {19, 20, 15},{100, 90, 89, 7888},{900, 700, 600, 500}};

        int max= numbers[0][0]; // assume that first element is the max

        for(int i = 0; i< numbers.length; i++){//checks  each single dimensional array
            for(int x =0; x<numbers[i].length;x++){ // check each element in the single dimenstional array
                if(max<numbers[i][x]){    // compares index 0 of the array with each indexes
                    max=numbers[i][x];  // assigns the maximum number
                }
            }

        }
        System.out.println("max number " +max);

        int max2=numbers[0][0];
        for(int[] eachNum : numbers){// variable eachnum rep single dimensional array in numbers
          for(int eachInt:eachNum){
               if(max2<eachInt){
                   max2=eachInt;
               }
          }
        }
        System.out.println(max2);
        // finding the minimum number:
        int min = numbers[0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(min>numbers[i][j]){
                    min=numbers[i][j];
                }
            }

        }
        System.out.println(min);

        System.out.println("==============");
    }

}
