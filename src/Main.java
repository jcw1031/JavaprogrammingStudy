import java.util.*;

class ThreadA extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("a");
        }
    }
}

class ThreadB extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("b");
        }
    }
}

public class Main{
    public static void main(String[] args) throws InterruptedException {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();
    }
}