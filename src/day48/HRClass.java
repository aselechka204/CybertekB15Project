package day48;

public class HRClass {
    public static void main(String[] args) {

//        Employee e1 = new Employee();
//
        HourlyEmployee e1 = new HourlyEmployee("Subi", 101, 55, 2000);
        e1.calculateAnualSalary();

        System.out.println("e1 = " + e1);

        HourlyEmployee e2 = new HourlyEmployee("Roksana", 102, 57, 2080);
        e2.calculateAnualSalary();
        System.out.println("e2 = " + e2);

        FullTimeEmployee e3 = new FullTimeEmployee("Ainura", 103, 10000);
        e3.calculateAnualSalary();
        System.out.println("e3 = " + e3);

        FullTimeEmployee e4 = new FullTimeEmployee("Dennis", 104, 13000);
        e4.calculateAnualSalary();
        System.out.println("e4 = " + e4);


        // each and every class we create , it will become a data type (reference type)


    }
}
