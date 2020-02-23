package day15;

public class SubString {
    public static void main(String[] args) {
        // getting the part of the String out of another String
       //   //         0123456789012345
       String movie = "Lord Of The Ring";

        String wordOf=movie.substring(5,7);
        System.out.println("wordOF = "+wordOf);

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe "+ wordThe);

       /// i want to get the String <of> from the movie


       int StartingPoint = movie.indexOf(" ")+1;
       int endingPoint = movie.length();
        System.out.println("Second word till last:"+movie.substring(StartingPoint,endingPoint));

      String secondWordTillLast =movie.substring(5,16);
        System.out.println("secondWordTillLast="+ secondWordTillLast);

        String WordLostOf= movie.substring(0,7);
        System.out.println("wordloSTOF"+WordLostOf);

        //if you want to start from somewhere and just get the rest of the String

        String secondToLast= movie.substring(5);

        System.out.println(movie.substring(12,16)+" "+movie.substring(5,11)+" "+movie.substring(0,4));

    }
}
