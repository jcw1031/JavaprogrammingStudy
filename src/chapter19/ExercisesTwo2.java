package chapter19;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

class ClockThread implements Runnable{
    private JLabel jl;

    public ClockThread(JLabel jl){
        this.jl = jl;
    }
    @Override
    public void run() {
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        jl.setText(hour+":"+min+":"+second);

        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            second++;
            if(second == 60){
                min++;
                second = 0;
                if(min == 60){
                    hour++;
                    min =0;
                }
            }
            if(second<10){
                jl.setText(hour+":"+min+":0"+second);
                continue;
            }
            jl.setText(hour+":"+min+":"+second);
        }
    }
}

public class ExercisesTwo2 extends JFrame{
    private Container ct;
    private JLabel jl;

    public ExercisesTwo2(){
        ct = getContentPane();
        jl = new JLabel();
        jl.setFont(new Font("Gothic", Font.ITALIC, 80));
        ct.setLayout(new FlowLayout());
        ct.add(jl);

        ClockThread runnable = new ClockThread(jl);
        Thread thread = new Thread(runnable);

        setTitle("시계");
        setVisible(true);
        setSize(500, 140);

        thread.start();
    }

    public static void main(String[] args) {
        new ExercisesTwo2();
    }
}
