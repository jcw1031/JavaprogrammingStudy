package classPractice;
class BankAccount{
    String owner;
    int accountNum;
    int balance=0;
    public void deposit(int n){
        balance+=n;
    }
    public void withdraw(int n){
        balance-=n;
    }
}
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount();
        myAccount.deposit(10000);
        System.out.println(myAccount);
        myAccount.withdraw(4000);
        System.out.println(myAccount);
    }
}
