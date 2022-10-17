class ThreadExample implements Runnable {
    @Override
    public void run() {
        System.out.println("thread start.");
        for(int i=0;i<100;i++){
            System.out.print("1");
        }
        System.out.println("thread end.");
    }
}

class ThreadExample2 implements Runnable {
    @Override
    public void run() {
        System.out.println("thread2 start.");
        for(int i=0;i<100;i++){
            System.out.print("2");
        }
        System.out.println("thread2 end.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadExample r = new ThreadExample();
        Thread thread = new Thread(r);

        ThreadExample2 rr = new ThreadExample2();
        Thread thread2 = new Thread(rr);

        thread.setPriority(1);
        thread2.setPriority(10);

        thread2.start();
        thread.start();
//        thread.join();

        System.out.println("main end.");
    }


}