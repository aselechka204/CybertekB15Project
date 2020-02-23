package day60;

public class Job implements Comparable<Job>{

    private String location;
    private  int  salary;
    private String companyName;

    public Job(String location, int salary, String companyName) {
        this.location = location;
        this.salary = salary;
        this.companyName = companyName;
    }

    @Override
    public String
    toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }



    @Override
    public int compareTo(Job o) {

       if (this.salary > o.salary) {
       return 1;
   } else if(this.salary < o.salary){
          return -1;
       }else{
           return 0;
       }
   }
}
