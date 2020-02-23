package day60;

import java.io.FileNotFoundException;

public class DangerZoneAgain2 {

    //handle or declare are the way to deal with checked exception
    //if you are sure the method will never actually throw the exception
    //its good to just declare it to go through compiler to make it happy
    // if there is actually a chance for the exception might left unhandled
    // its good to wrap up under try catch


    public static void main(String[] args) throws InterruptedException {

        //calling a method that declare to throws checked exception
        System.out.println("The Start");

            readMyFile();

        Thread.sleep(3000);
        System.out.println("The end");

    }

    // document this method to tell the caller, the file you are about to read might not exists
    // and handle the consequences yourself
    // the exception type already exists for this type of situation is called
    //filenotfoundexception from java.util package

    // FileNotFoundException extends IOException

    public static  void readMyFile(){

        System.out.println("Reading the file in my computer");

        try {
            throw new FileNotFoundException("Kaboom! file is not here");
        }catch(FileNotFoundException e){
            System.out.println("AHA! CAUGHT YOU IN READMYFILE");
        }
    }
}
