package day40;

public class Offer1Part {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    /*
    This is a instance method to print all the information about Offer object
     */
    //inside instance method we can directly access instance variable
    public void displayInformation(){


    }
    //write a method called turnToFullTime
    public void turnToFullTime(){
          if(isFullTime==false) {
              isFullTime = true;
          }else{System.out.println("Location= "+location+" | "+"Company = "+
                  company+" | salary = "+salary+
                  " | isFullTime = "+isFullTime);
              System.out.println("Already fulltime!");
          }
    }

    public void changeLocation(String newLocation){
        location=newLocation;
    }

    //write method to accept 4 parameter to change all info
    //about offer

    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime){

        company=newCompany;
        location=newLocation;
        salary=newSalary;
        isFullTime=newIsFullTime;
        displayInformation();
    }
    // write a method to check the offer belong to 100k club
    public boolean is100KOffer(){

        return salary>=100000;

    }
    //create a method called toString no parameter

    public String toString (){
      String str="[ Location= "+location+" | "+
              "Company = "+ company+
              " | salary = "+salary+
              " | isFullTime = "+isFullTime+"]";

        return str;


    }
}
