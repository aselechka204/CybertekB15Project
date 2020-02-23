package day60;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionContinue {
    public static void main(String[] args) {

        // collection interface as super type, pointing to and ArrayList object
     //   Collection<Integer>nums= new ArrayList<>();

        //ArrayList is backed by array in the back
        //so if we have arrayList with 4 elements
        //in the back we have array with size 4 holding all those elements
        //if you add one item to the list using add method
        // it will create an array with size 5 then copy all for above
        // and add the new item at the end

        //linked list is backed by something called node
        // see it as 4 people holding hands
        // the neighboring person have pointer to the previous and next person
        //because they are holding hands
        // if you want to add one person, new person will just have to hold last persons hand
        // if you want to insert in the middle
        //now new person just needs to hold previous and next persons hand


        List<String> lst= new LinkedList<>();

        lst.add("Zeynep");
        lst.add("Asel");
        lst.add("Damir");
        lst.add("Alan");
        lst.add("Adam");

        System.out.println("lst " +lst);

        lst.remove("Zeynep");
        System.out.println("lst= "+lst);

    }
}
