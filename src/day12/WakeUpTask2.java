package day12;

public class WakeUpTask2 {
    public static void main(String[] args) {
    int month = 1;

    if (month <1 || month > 12 ) {
        System.out.println("Invalid Month");
    } else if (month>=3 && month<=5){
        System.out.println("It's Spring");
    } else if ( month>=6 && month<=8){
        System.out.println("It's Summer");
    } else if (month>=9 && month<=11){
        System.out.println("It's Fall");
    } else if (month== 12 || month==1 ||month==2 ){
            System.out.println(" It's Winter ");
// since 1st condition is already taking out invalid situation
        // we dont need else code
        }
    }
}
