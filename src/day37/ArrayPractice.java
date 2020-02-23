package day37;

import java.util.ArrayList;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayList<String> nameLst =new ArrayList<String>();


        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Guzelnurin");
        nameLst.add("Mustafa");
        nameLst.add("Ayjerenjan");

        System.out.println("nameLst = " + nameLst);

        // find Longest name
        // assume the first one is the longest then compare with the rest

        String longestName=""; //nameLst.get(0);
        for (int x = 0; x <nameLst.size() ; x++) {
            String currentName=nameLst.get(x);
            if(currentName.length()>longestName.length()){
                longestName=currentName;
            }


        }
     //   System.out.println("longest name="+ longestName);

        // how do i get the concatenation of all longest words if there are more than one
        //first find out the longest word, and get the character count
        // then loop through each name
        // and check whether character count equals to longest word character count


        for (int i = 0; i <nameLst.size() ; i++) {
            if(nameLst.get(i).length()==longestName.length()){
                System.out.println("Longest words="+nameLst.get(i));
            }
        }

        // length   : counting the elements inside array, its a property of array object
                  // last item of an array: arr[arr.length-1]
        //length() : counting the characters inside String, its a method of String object
                  // last char of a String : str.charAt(str.length-1)
        //size()   : counting the elements inside ArrayList object
                  //last element of an arrayList: lst.get(lst.size()-1)

        // how do we use for each loop to go through each items
        System.out.println("------------");
        for(  String currentName:nameLst){
            System.out.println("currentName: "+currentName);
        }


    }
}
