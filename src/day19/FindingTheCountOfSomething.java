package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        //from 1-100 how many numbers can be divided by 158

          int count = 0;
        for (int i = 1; i <100 ; i++) {


            if(i % 15==0  ){
              //  System.out.println( i );
                //++count
                //count+=1;
                count = count+1;

            }

            System.out.println("counter "+ count);
        }




        // given a string with value , find out how many a showed up in the String

        String name = "Esra Fidan";
        System.out.println(name.charAt(0)=='a'); //false
        System.out.println(name.charAt(1)=='a');// false
        System.out.println(name.charAt(2)=='a'); // false
        System.out.println(name.charAt(3)=='a'); // true

        System.out.println("------------");

        int countOfA=0;

        for(int x = 0;x<name.length(); x++){
            System.out.println(name.charAt(x));

            if(name.charAt(x)=='a'){
              //  System.out.println("BINGO FOUND IT ");
                ++countOfA;
            }
            System.out.println("Count = "+countOfA);
        }
    }
}
