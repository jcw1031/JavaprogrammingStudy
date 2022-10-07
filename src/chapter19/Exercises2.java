package chapter19;

class RunnableNum implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.print(i+", ");
        }
    }
}

class RunnableChar implements Runnable{
    char token;
    public RunnableChar(char token){
        this.token = token;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.print(token+", ");
        }
    }
}

public class Exercises2 {
    public static void main(String[] args) {
        RunnableNum rn = new RunnableNum();
        RunnableChar rx = new RunnableChar('x');
        RunnableChar ry = new RunnableChar('y');

        Thread tn = new Thread(rn);
        Thread tx = new Thread(rx);
        Thread ty = new Thread(ry);

        tn.start();
        ty.start();
        tx.start();
    }
}
