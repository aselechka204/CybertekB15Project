package day59;

public class FinallyBlock {
    public static void main(String[] args) {

        //in some cases we want to run certain code
        // no matter exception happen or not
        //as part of try catch
         int[]nums={1,4,6};
        try {

            System.out.println("nums [5]="+nums[5]);
        } catch (Exception e) {
            //how do i get the message out of the exception object
            //any exception object can have message filed
            // and it can be extracted by calling getMessage method
            System.out.println("Exception caught" +e.getMessage());
        }finally{
            System.out.println("THIS CODE WILL ALWAYS RUN NO MATTER WE HAVE EXCEPTION OR NOT");
            //ITS USED TO CLOSE THE RESOURCE
            //ITS THE CONNECTION
        }
        System.out.println("The end");
    }
}
