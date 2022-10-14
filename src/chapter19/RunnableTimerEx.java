package chapter19;

import javax.swing.*;
import java.awt.*;

class TimerRunnable implements Runnable{
    private JLabel timerLabel;

    public TimerRunnable(JLabel timerLabel){
            this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n=0;
        while(true){
            timerLabel.setText(Integer.toString(n));
            n++;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                return;
            }
        }
    }
}

public class RunnableTimerEx extends JFrame {
    public RunnableTimerEx(){
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());

        JLabel jl = new JLabel();
        jl.setFont(new Font("Gothic", Font.ITALIC, 80));
        ct.add(jl);

        TimerRunnable runnable = new TimerRunnable(jl);
        Thread th = new Thread(runnable);

        setSize(250, 150);
        setVisible(true);
        setTitle("Runnable을 구현한 타이머 스레드 예제");

        th.start();
    }

    public static void main(String[] args) {
        new RunnableTimerEx();
    }

}