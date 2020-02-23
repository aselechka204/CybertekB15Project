package day23;

import java.beans.FeatureDescriptor;

public class ForEachLoopExample {
    public static void main(String[] args) {
        long[] salaries={100000 , 200000 , 150000, 115000, 60000 };
        long maxSalary=salaries[0];
        for (long salary :salaries) {
            if (salary>maxSalary){
                maxSalary=salary;
            }
        }
        System.out.println("MAX salary :"+ maxSalary);
    }
}
