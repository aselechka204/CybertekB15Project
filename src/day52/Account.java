package day52;

//public class Account implements Transferable{
    public class Account implements Transferable, Comparable<Account> {

    protected String name;
    private int balance;


 public Account(String name, int balance){
     this.name=name;
     this.balance=balance;
 }
    @Override
    public int compareTo(Account otherAccount) {

        if (this.balance > otherAccount.balance) {
            return 1;
        } else if (this.balance < otherAccount.balance) {
            return -1;
        } else {
            return 0;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
     balance+=amount;
    }
    public void withdraw(int amount) {
        balance -= amount;

    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
    @Override
    public void transferAll(Account otherAccount){
        otherAccount.balance+=this.balance;
        this.balance=0;
    //// otherAccount.deposit(this.balance);
    // this.withdraw(this.balance)


        // get the balance of current account
        // deposit to the other account
        //set current account balance to 0

 }

 // add a method called isPalindrome and return true if the name is
    //palindrome

    public boolean isPalindrome(){
     // first store it into temp replace all the space and make it
        //lower case

        String nameCopy= this.name.toLowerCase().replace(" ", "");
        //we need to reverse the value then check whether they are still same String or not
        String reverseResult="";
        for (int i = nameCopy.length()-1; i >=0 ; i--) {
            reverseResult+=""+nameCopy.charAt(i);

        }

     return nameCopy.equalsIgnoreCase(reverseResult);

    }

}
