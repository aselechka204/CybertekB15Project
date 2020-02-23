package day07;

import java.util.Scanner;

public class Repl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the patient portal! ");

        System.out.println("Please enter your personal information ");


        System.out.println("Enter your first name");
        String firstName = scan.nextLine();


        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

        System.out.println("Enter your email");
        String email = scan.nextLine();

        System.out.println("Enter your street");
        String street = scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married True or False?");
        boolean isMarried = scan.nextBoolean();

        String fullAddress = ("" + zipcode);

        String fullName = (firstName)+(lastName);
        String address = (street)+(city)+(state)+(fullAddress);
        String contacts =("Work Phone number -" +workPhoneNumber +", Personal phone number -"+personalPhoneNumber + ",email: " + email);



        System.out.println("Patient Personal Information");

        System.out.println("Full name:" + fullName);

        System.out.println("Address: " + address);

        System.out.println("Contacts:"+ contacts);
        System.out.println("Age: "+age +"\n"+ "Height: "+ height + "\n"+ "Weight: "+ weight+"\n"+ "Married?: "+isMarried);

    }
}


