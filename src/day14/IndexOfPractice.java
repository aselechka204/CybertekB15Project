package day14;

public class IndexOfPractice {
    public static void main(String[] args) {
        //index of ---> find out index of another string inside this string
                //     012345678901
       String name =  "Game of Java"; // 12 characters , length is 12, last char 11
       // find out the location of java
        // location of letter O
        //location of first space
        System.out.println("Find out the location of JAVA");
        System.out.println(name.indexOf("Java"));

        System.out.println("Find out the location of o");
        System.out.println(name.indexOf("o"));

        System.out.println("Find out the location of uppercase O");
        System.out.println(name.indexOf("O"));

        System.out.println("find out the location of first space");
        System.out.println(name.indexOf(" "));


    }
}
