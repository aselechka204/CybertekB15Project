package day40;

public class BankAccount {

    String accountType;
    String accountHolder;
    long accountNumber;
    double balance;
// set all the value
    //withdraw 100$ cash
    //deposit
    //withdrawal amount
    //show account balance
    //to string
   public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance){

       accountType=newAccountType;
       accountHolder=newAccountHolder;
       accountNumber=newAccountNumber;
       balance=newBalance;

   }

    public void showAccountBalance(){
        System.out.println("current balance= " + balance);
    }
    public void showAccountHolderAccountType(){

        System.out.println("Account type"+ accountType);
    }

    public double getBalance(){

       return balance;
    }
    public void deposit(double amount){

       balance=balance+amount;
    }
     public void withdrawal(double amount){
       balance=balance-amount;
     }
      public void withdraw100$Cash(){

       withdrawal(100);
      }

      public void purchaseProduct(double productPrice, double count){

       double totalPrice=productPrice*count;
       balance-=totalPrice;

      }

    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
