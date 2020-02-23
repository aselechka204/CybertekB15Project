package day52;

import java.util.ArrayList;
import java.util.List;




public class AccountListSorting {
    public static void main(String[]args){

    List<Account> accounts = new ArrayList<>() ;

      accounts.add(new Account("John Snow",10000));
      accounts.add(new Account("Vlad",11000));
      accounts.add(new Account("Ata",15000));
        System.out.println(accounts);

Account myAccount = new Account( "Muge", 0);

        for (Account each:accounts) {
            each.transferAll(myAccount);
        }
        System.out.println("myAccount ="+ myAccount);
        System.out.println(accounts);

        Account a = new Account("Polymorphism", 10000);
        Transferable t1= new Account("Polymorphism2", 10000);
        Comparable c1= new Account("Polymorphism3", 10000);
        Object o1= new Account("Polymorphism4",10000);
    }
}