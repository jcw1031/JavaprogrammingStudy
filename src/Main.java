class ThreadExample implements Runnable {
    @Override
    public void run() {
        System.out.println("thread start.");
        for(int i=0;i<100;i++) {
            System.out.println(i);
        }
        System.out.println("thread end.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadExample r = new ThreadExample();
        Thread thread = new Thread(r);

        thread.start();
//        thread.join();

        System.out.println("main end.");
    }
}