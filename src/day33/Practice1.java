package day33;

public class Practice1 {
    public static void main(String[] args) {

        System.out.println(calculateAndReturnAge(1985));



    }

    public static int calculateAndReturnAge(int birthYear){
        int age=0;
     if(birthYear>1900 && birthYear<2020){
         age=2019-birthYear;
     }else{
         age=0;
     }

        return age;
    }
}
