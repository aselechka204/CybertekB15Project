package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {


        long[] salaries={120000 , 100000 , 105000, 110000, 115000 };

        for( long amount    : salaries     ) {
            System.out.println(amount);
              int desired=salaries.length;


            }
        for( long amount    : salaries     ) {

        if(amount<=110000) {
            continue;
        }
            System.out.println("Salary "+amount);
        }

        }


        }


