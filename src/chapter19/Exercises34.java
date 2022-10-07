package chapter19;

class Account{
    private int total = 0;
    synchronized void deposit(){
        total +=1000;
    }
    int getTotal(){
        return total;
    }
}

class Customer implements Runnable{
    String name;
    Account same_a;
    public Customer(Account a, String name){
        same_a=a;
        this.name = name;
    }

    @Override
    public void run(){
        for(int i=1;i<=200;i++){
            System.out.println(name+" : "+i+"번째");
            if(same_a.getTotal()>=500000) break;
            same_a.deposit();
        }
    }

    public String getName(){
        return name;
    }
}

public class Exercises34 {
    public static void main(String[] args) throws Exception{
        Account account = new Account();
        Customer donator1 = new Customer(account, "1번째 성금자");
        Customer donator2 = new Customer(account, "2번째 성금자");
        Customer donator3 = new Customer(account, "3번째 성금자");
        Customer donator4 = new Customer(account, "4번째 성금자");
        Customer donator5 = new Customer(account, "5번째 성금자");

        Thread thread1 = new Thread(donator1);
        Thread thread2 = new Thread(donator2);
        Thread thread3 = new Thread(donator3);
        Thread thread4 = new Thread(donator4);
        Thread thread5 = new Thread(donator5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        System.out.println(account.getTotal());
    }
}
