package day32;

public class CharacterActions {
    public static void main(String[] args) {

        alphabet();
        zToA();
printAlphabetInRange('a', 'f');
printAlphabetInRange('G','B' );
printAlphabetInRange('A','a');





    }

    public static void printAlphabetInRange(char start, char end){
// this mean begining character comes from ending character
        // in ascii table
        if(start<end){
            System.out.print("we need to increment from "+ start+" till "+end);
            for (char iChar = start; iChar <=end ; iChar++) {
                System.out.print(iChar+" ");
            }
            System.out.println();
        }else if(start>end){
            System.out.print("we need to decrement from "+start+" till "+end);
            for (char iChar = start; iChar >= end; iChar--) {
                System.out.print(iChar+" ");
            }
        }else{
            System.out.println("they are the same character");
        }



    }

    public static void alphabet(){
        for (char iChar = 'A'; iChar <='Z' ; iChar++) {
            System.out.print(iChar+" ");

        }
        System.out.println();



    }

    public static void zToA(){

        for (char iChar = 'Z'; iChar >='A' ; iChar--) {
            System.out.println(iChar+" ");
        }
        System.out.println();
    }
}
