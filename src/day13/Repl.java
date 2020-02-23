package day13;

import java.util.Scanner;

public class Repl {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");

        String item1 = scan.nextLine();
        double price1 = scan.nextDouble();
        int count1 = scan.nextInt();
        System.out.println(item1+"/n"+count1+"/n"+price1);



        System.out.println("Enter Item1, count and its price:");

        System.out.println(item1+"/n"+count1+"/n"+price1);


        String item2 = scan.nextLine();
        double price2 = scan.nextDouble();
        int count2 = scan.nextInt();
        System.out.println("Enter Item2, count and its price:"+"/n"+item2+"/n"+count2+"/n"+price2);


        String item3 = scan.nextLine();
        double price3 = scan.nextDouble();
        int count3 = scan.nextInt();
        System.out.println("Enter Item3, count and its price:"+"/n"+item3+"/n"+count3+"/n"+price3);

        int report = count1+count2+count3;
        double totalPrice = price1+price2+price3;

        System.out.println("Item1: "+item1+"Price:"+price1+", Item3: "+item3+"Price: "+price3);
        System.out.println(report);
        System.out.println("Total price: 42.3"+totalPrice);

    }
}
