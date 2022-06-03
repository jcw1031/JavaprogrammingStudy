package classPracticeSecond;

class BankAccount{
    String owner;
    static int accountNumber;
    int balance;
    public BankAccount(){
        balance = 0;
    }
    public void deposit(int money){
        this.balance+=money;
    }
    public void withdraw(int money){
        this.balance-=money;
    }
    public String toString(){
        return ""+this.balance;
    }
}
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(100000000);
        System.out.println(myAccount);
        myAccount.withdraw(26900000);
        System.out.println(myAccount);
    }
}