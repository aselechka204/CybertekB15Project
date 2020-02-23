package day18;

public class OfficeHour2 {
    public static void main(String[] args) {
        String name= "Zehra Aygun";

        // getting each character using charAt(index)
        //generate sequential number 0 --> 10
        // is there any chance that while loop does not execute

        int x =0;
        while(x<name.length()){
            System.out.print("index: "+x);
            System.out.println( name.charAt(x));
            ++x;
        }




     //   while(x<15){
    //        System.out.println("Wol@");
     //   }
        System.out.println("The end");
    }
}
