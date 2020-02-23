package day40;

public class AtTheBank {
    public static void main(String[] args) {

        BankAccount b1= new BankAccount();
        b1.setAllTheValue("Checking", "Aselya", 78787877, 200000);

        b1.showAccountBalance();

        b1.showAccountHolderAccountType();

        b1.deposit(3000);
        System.out.println(b1);

        b1.withdrawal(12000);
        System.out.println(b1);

        b1.purchaseProduct(120, 3);
        System.out.println(b1);

        
    }
}
