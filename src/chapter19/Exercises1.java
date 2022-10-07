package chapter19;

class ThreadA extends Thread {
    public ThreadA(){}
    public ThreadA(String name){
        setName(name);
    }
    @Override
    public void run(){
        if(!this.getName().equals("")) {
            for (int i = 0; i < 50; i++) {
                System.out.print(this.getName() + ", ");
            }
        }
        else{
            for(int i=0;i<50;i++){
                System.out.print(i+", ");
            }
        }
    }
}

/*class ThreadB extends Thread{
    public ThreadB(String name){
        setName(name);
    }

    @Override
    public void run(){
        for(int i=0;i<50;i++){
            System.out.print(i+", ");
        }
    }
}*/

public class Exercises1 {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA("x");
        ThreadA tb = new ThreadA("y");
        ThreadA tc = new ThreadA("");
        ta.start();
        tb.start();
        tc.start();

        System.out.println(tc.getName());
    }
}
