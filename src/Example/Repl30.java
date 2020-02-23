package Example;

import java.util.Scanner;

public class Repl30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();


        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();


        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();


        System.out.println("Item1  "+item1+" Price "+(count1*price1));
        System.out.println("Item2  "+item2+" Price "+(count2*price2));
        System.out.println("Item3  "+item3+" Price "+(count3*price3));

        String report = (" " +count1+count2+count3);
        double totalPrice = (count1*price1)+(count2*price2)+(count3*price3);




        if (count1 == 0 ){
            System.out.println("Item2  "+item2+" Price "+(count2*price2));
            System.out.println("Item3  "+item3+" Price "+(count3*price3));
        } else if(count2 == 0){
            System.out.println("Item1  "+item1+" Price "+(count1*price1));
            System.out.println("Item3  "+item3+" Price "+(count3*price3));
        }else if(count3 ==0){
            System.out.println("Item1  "+item1+" Price "+(count1*price1));
            System.out.println("Item2  "+item2+" Price "+(count2*price2));
        }

        System.out.println("Item1: "+item1+"Price:"+price1+", Item3: "+item3+"Price: "+price3);
        System.out.println(report);
        System.out.println("Total price:"+totalPrice);


    }
}