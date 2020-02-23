package day35;

public class StringToIntegerParsing {
    public static void main(String[] args) {

        String strName="100";
        int num= Integer.parseInt(strName);
        System.out.println("num= "+num);

        String empID= "FB-457";
        /*
        Integer class is class coming from java.lang package
        it's primarily used for wrapping up primititive value and treat it as
        what we will focus here is though
        many useful static methods it will provide already
        paseInt is a static method of Integer class
        It will turn a String that has only numbers and return int result
        if we have any non numerical character-->>it will throw numberFormatException
         */
       // int id=Integer.parseInt(empID.split("-"[1]));
        String[] empIDsplit= empID.split("-");
        String idstr= empIDsplit[1];
        int id=Integer.parseInt(idstr);
        System.out.println(" id = "+ id);


        // i have a String called twoNumbers

        String twoNumbers="100,600";
        // add them and give the result

        String[] numSplit=twoNumbers.split(",");

        int num3=Integer.parseInt(numSplit[0]);
        int num4=Integer.parseInt(numSplit[1]);
        System.out.println(num3+num4);

    }
}
