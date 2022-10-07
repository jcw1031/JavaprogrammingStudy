package chapter19;

class Account1{

    int balance = 0;

    synchronized void deposit(int money){
        balance+=money;
        System.out.println("저축 "+money+"원, 잔고 : "+balance);
        notify();
    }

    synchronized void withdraw(int money){
        try {
            while (balance < money) {
                wait();
            }
        } catch(Exception e){}
        balance-=money;
        System.out.println("인출 "+money+"원, 잔고 : "+balance);
    }

}

class Deposit implements Runnable{

    Account1 account;

    public Deposit(Account1 account){
        this.account = account;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int money = (int)(Math.random()*10)+1;
            account.deposit(money);
        }
    }
}

class Withdraw implements Runnable{

    Account1 account;

    public Withdraw(Account1 account){
        this.account = account;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            int money = (int) (Math.random() * 10) + 1;
            account.withdraw(money);
        }
    }
}

public class Exercises5 {
    public static void main(String[] args) {
        Account1 account1 = new Account1();

        Thread deposit = new Thread(new Deposit(account1));
        Thread withdraw = new Thread(new Withdraw(account1));

        /*withdraw.setPriority(10);
        deposit.setPriority(1);*/

        withdraw.start();
        deposit.start();
    }
}
