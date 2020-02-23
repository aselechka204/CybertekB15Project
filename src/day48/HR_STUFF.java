package day48;

import java.util.Arrays;
import java.util.List;

public class HR_STUFF {
    public static void main(String[] args) {


        //   HourlyEmployee e1= new HourlyEmployee("Subi", 101, 55, 2000);

        // if we have employee data type for e1 variable
        //we can write down the address of anything IS A Employee

        Employee e1 = new HourlyEmployee("Subi", 101, 55, 2000);
      //  e1.calculateAnualSalary();
     //   e1 = new FullTimeEmployee("Ainura", 101, 1000);
     //   e1.calculateAnualSalary();

        Employee e2 = new HourlyEmployee("Roksana", 102, 57, 2080);
        Employee e3 = new FullTimeEmployee("Dennis", 104, 13000);

        // what is the easiet way to store these 3 objects together

        List<Employee> allEmployee= Arrays.asList(e1, e2, e3);

        for (Employee each :allEmployee) {
         //
            //  System.out.println("each= "+ each);
            System.out.println("Name is: "+ each.name);
            each.calculateAnualSalary();
        }


    }
}