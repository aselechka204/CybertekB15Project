package day13;

public class StringPractice2 {
    public static void main(String[] args) {
        String name = "Pumpkin";
        System.out.println(name);

      //  name = "cat";
     //   System.out.println(name);

        name.toUpperCase();
        System.out.println(name);
        System.out.println( name.toUpperCase());

        // String is immutable; once created it can not be changed
        //any String actions methods that look like changing the value
        //actually creating a new String object

        // WHAT IF I REALLY WANT TO CHANGE THE NAME

        name = name.toUpperCase();
        System.out.println( name);

    }
}
