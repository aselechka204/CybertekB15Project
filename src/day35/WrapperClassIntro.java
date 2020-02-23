package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int x=10;
        // primitive data types are pure value has no attribute or behavior
        // each primitive type has wrapper class that turn it into object so we can treat it as


        // this is the old not recommended way of creating Integer Object
        Integer xobj1= new Integer(12);
        // valueOf method of Integer class
        // return a integer object by wrapping up the value you passed
        // it has 2 overloaded version one that accept int, another accept String

        Integer xobj2= Integer.valueOf(10);
        Integer xobj3= Integer.valueOf("10");

        // since x2 is pointing to Integer Object
        // we can call all the methods of Integer class using this Object

        byte bValue=xobj2.byteValue();
        System.out.println("byte Value="+bValue);

        double dValue=xobj2.byteValue();
        System.out.println("byte Value="+dValue);
    }
}
