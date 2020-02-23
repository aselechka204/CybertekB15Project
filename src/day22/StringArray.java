package day22;

public class StringArray {
    public static void main(String[] args) {
        //create string array with size that you define
        //and store all your household members name

        String[] family=new String[4];
        family[0]="Aseliya";
        family[1]="Damir";
        family[2]="Alan";
        family[3]="Adam";

   //     System.out.println(family[0]);
  ////      System.out.println(family[1]);
  //      System.out.println(family[2]);
  //      System.out.println(family[3]);

        for (int i = 0; i <4 ; i++) {
            System.out.println(family[i]);

            // immutable means you can not change the internal structure of the object
            // if you have string acb ="hello"
            // if you do abc.toUppercase -->> it will create new string object "HELLO"
            //ad it does not change original hello at all!!
            // not resizable --> specifically for array
            // we can not change the size of array once we create them with certain size
            //however we can change the elements inside this array
            // and it means it is not immutable

        }


    }
}
