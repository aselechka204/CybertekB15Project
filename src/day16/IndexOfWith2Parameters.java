package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {
        //             012345678901234567890123456789012

     // get the second java from the sentence
        // assume you already know there is 4 Java in this sentence
        // second java means == the java showed up after first java
        //first find out where is the first java index
        // in order to find second one, instead of sercing from begining search from first java

        // but how do i start from different location when using index of
        // because indexof always start from begining
         // indexof method has 2 versions 1 expect 1 external data
        // another expect 2 external data -->yourString
        //             012345678901234567890123456789012
        String name = "I love Java I Love Java Java Java";
        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java", 7));
        System.out.println(name.indexOf("Java", 8));
        System.out.println(name.indexOf("Java", 9));
        System.out.println("Strting from 20 "+name.indexOf("Java", 20));

        // how do i start from the location that get past first java
        // basically starting point different that 0 so that it get past first java

        int firstJavaLocation= name.indexOf("Java"); // location of first Java case 7
        int startingPointToSearchSecondJava= firstJavaLocation+1;

        // starting point can be right after first character
        //or you can start here +4
        // or you can start write after you finish the word you are searching for the word java+4

        int secondJavaLocation=name.indexOf("Java",startingPointToSearchSecondJava);
        System.out.println("second Java Location= "+ secondJavaLocation);

        int firstSpace= name.indexOf(" ");
        int secondSpace=name.indexOf(" ",firstSpace+1);
        System.out.println("Second word in this sentence is " + name.substring(firstSpace+1,secondSpace));

    }
}
