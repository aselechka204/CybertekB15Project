package day39;

public class Student{

        // instance field:
    /*
    Any time you create a class, it will become a  blue print for object
    And this class type can be a type for variable
    for example StTING HAS ITS OWN CLASS SO we can create a String variable
    and assign a String object

    in here student become a blue print for creating a student object
    and any student object has 3 attributes defined by instance field\variable
     */




        String name;
        int age;
        char gender;




    public static void main(String[] args) {

        Student s1= new Student();
        s1.name="Aseliya";
        s1.age=18;
        s1.gender='F';

        System.out.println("s1 name "+s1.name);

        Student s2=new Student();
        s2.name="Juma";
        s2.age=29;
        s2.gender='M';
        System.out.println("s2 age "+ s2.age);

        // i want to save Juma's age before i change it so i still have access
        int oldAge=s2.age;
        s2.age=26;

        System.out.println(s2.name+" | "+s2.age+" | "+s2.gender);
        System.out.println(oldAge+" old age");

        System.out.println("The difference is "+(oldAge- s2.age) );



    }

}
