package day35;

public class WrapperTypePrimitiveTypeConversion {
    public static void main(String[] args) {
        Integer num1= 100; //--->auto boxing 100-->new Integer(100)
       //Integer.valueOf() is a method that return Integer Object
        //it has 2 overloaded version one that accept number, another accept String
        // but both of them return integer object
        int num2=Integer.valueOf("200"); // auto unboxing into 200

      // this can not happen by itself
     //   int num3="200";

        int num3=Integer.parseInt("200");

        /*
        Integer.parseInt(numberHere)
        it return an  int value converted to String

        Integer.valueOf("numberHere")
        It retnrs an Integer Object by wrapping up the number

        YOU MAY USE WHICHEVER YOU WANT BECAUSE:
        Auto boxing and Auto unboxing will take case of the conversion anyway
         */

        // use this number IPR2012-00001 and store the year into a int variable

        String caseNumber="IPR2012-00001";
     //   int year;
      //  int num = Integer.valueOf("IPR2012-00001".substring(3,7));
      //  System.out.println(num);

    //    String strYear=caseNumber.substring(3,7);
     //   year=Integer.parseInt(strYear);
     //   System.out.println("strYear ="+ strYear);


        System.out.println(getYearOutOfCaseNumber("DER2019-00034"));
        System.out.println(getYearOutOfCaseNumber("IPR2009-01042"));
        System.out.println(getYearOutOfCaseNumber("CBM2001-10133"));

    }
    public static int getYearOutOfCaseNumber( String caseNumber){
     //   int year;
    //    String strYear=caseNumber.substring(3,7);
    //    year=Integer.parseInt(strYear);
    //    System.out.println("strYear ="+ strYear);
        return Integer.parseInt(caseNumber.substring(3,7));



    }
}
