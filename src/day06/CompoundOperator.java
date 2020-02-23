package day06;

public class CompoundOperator {
    public static void main(String[] args) {


         int studentsOnline = 263 ;

         studentsOnline += 5;

         //studentsOnline = studentsOnline + 5;
        // +=, -=, *=, /= , %= are called shorthand operation, compund operations
        // it can simplify the operation if you have same variable


        System.out.println("5 people joined the class " + studentsOnline);

        studentsOnline-= 3 ;

        System.out.println(" 3 people left the class" + studentsOnline);




       // studentsOnline = studentsOnline - 3;

        //System.out.println(studentsOnline);

        studentsOnline *= 2;
        System.out.println(" class doubled " + studentsOnline);




       // studentsOnline = studentsOnline * 2;


       // System.out.println("The student count doubled " +studentsOnline);

        studentsOnline /= 3;

        System.out.println(" student attandence dropped " + studentsOnline);



       // studentsOnline = studentsOnline / 3;


       // System.out.println("the student dropped to 1/3: " + studentsOnline);






    }



}
