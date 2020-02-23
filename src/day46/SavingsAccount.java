package day46;

public class SavingsAccount extends BankAccount {
    /*
    String accountHolder;
    long accountNum;
    double balance;
     */
    double interestRate;

    public SavingsAccount(String accountHolder, long accountNum, double balance, double interestRate){

        super(accountHolder, accountNum, balance);
        this.interestRate=interestRate;

    }
   // bad idea to have main here, just doing it anyway
    public static void main(String[] args) {

        SavingsAccount s1= new SavingsAccount("Asel", 12345, 500, 0.042);
        System.out.println("S1= "+ s1.toString());

      //  s1.withdraw(10000);
      //  System.out.println("s1= "+s1);

        s1.deposit(1000);
        System.out.println(s1);

    }
    @Override
    public void deposit(int amount){
        int actualAmount=(int)(amount+amount*interestRate);
       super.deposit(actualAmount);


    }

    // in our savingsaccount , if we withdraw amount you withdraw
    // you get 30 dollar penalty
    // so we will override the withdrawal method to reflect this requirment
    @Override
    public void withdraw(int amount){
        balance= balance-amount-30;

    }

    @Override // it is optional once being used it will enforce overriding rule
    //if any rule does not match it will not even compile
    //so its always good to use it to prevent accidental errors
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
