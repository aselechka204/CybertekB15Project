package day40;

public class HotMarketAction2 {
    public static void main(String[] args) {

        Offer1Part o1= new Offer1Part();
        o1.company = "Apple";
        o1.location= "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();

        Offer1Part o2= new Offer1Part();
        o2.company = "Google";
        o2.location= "Boston";
        o2.isFullTime = true;
        o2.salary = 100000;
        o2.displayInformation();

        Offer1Part o3= new Offer1Part();
        o3.company = "Amazon";
        o3.location= "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;
        o3.displayInformation();

        Offer1Part o4= new Offer1Part();
        o4.displayInformation();

        //Add 2k to amazon offer
        o3.salary=o3.salary+2000;
        o3.salary+=2000;
        System.out.println("new salary for amazon= "+o3.salary);

        //set the salary value of o4 offer object to sum of all the offers

        o4.salary=o1.salary+o2.salary+o3.salary;
        o4.displayInformation();
        o4.turnToFullTime();
        o4.turnToFullTime();
        o4.changeLocation("DC");
        o4.displayInformation();
    }
}
