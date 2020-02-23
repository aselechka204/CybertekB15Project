package day60;

import java.util.*;

// a class extends another class
// an interface extends another interface
//a class implements one or more interfaces


/* collection framework refers to entire thing, entire topic

   collection interface .... one interface under entire collection framework

   collections class .... (with an s in the end) its a class
                     .... is a utility class with many static methods
                     .....for example: collections.sort(your collection object1
 */


class CollectionExp {

    public static void main(String[] args) {


      //    List<String> names= new ArrayList<>();

        // with this assignment we can access only what collection interface have
        //so we can learn what any type of collection including set, queue, list have in common

      Collection<String> names = new ArrayList<>();

         names.add("Hasan");
         names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana");
        names.add("Daria");
        names.add("Lorin");

         names.addAll(names);

      //  names.remove("Hasan");
       names.removeAll(Arrays.asList("Hasan"));
       // quickly generating a type of list object ans assign it to super type collection:
        Collection<String>toRemoveLst= Arrays.asList("Abdullo");
        names.removeAll(toRemoveLst);

        System.out.println("names "+ names);

        for (String each:names) {
            System.out.println("each "+each);
        }
        //optionally this is how we can use for each method to print out everything in one shot
        names.forEach(each-> System.out.println("each ="+each));
    //    System.out.println("first item"+ names.get(0));


    }

}
