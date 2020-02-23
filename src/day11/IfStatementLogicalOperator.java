package day11;

public class IfStatementLogicalOperator {
    public static void main(String[] args) {
        // && is called short circuit and
        // it does not check the next condition as long as the first condition is false
        // just like if you have multiple condition for rocket launching
        // is EngineRunning, is CommunicationSystem working, is AirEnough?
        // is EngineRunning &&is CommunicationSystem working, is AirEnough?

        // if enginerunning is falseh then it does not go and check next conditions
        //& --> check each and every condition no matter what

        // is EngineRunning  & is CommunicationSystem working & is AirEnough?
        // is EngineRunning is false
        // it still check iSCommunicationSystemWorking
        // it still check isAirEnough
        // and eventually give you the outcome

        System.out.println( 7>5 && 1>7);
        System.out.println( 5>5 && 1>7);
        System.out.println( 1>5 && 9>7);

        System.out.println( 7>5 & 1>7);
        System.out.println( 5>5 & 1>7);
        System.out.println( 1>5 & 9>7);

       // System.out.println( 9/0); // ERROR can not divide by 0
        // i want to check whether dividing 9 by 0 is 3
       // System.out.println( 9/0 ==3 );

        System.out.println( 5>10 && 9/0 == 3);
        //System.out.println( 5>10 & 9/0 == 3);



    }
}
