package chapter19;

import javax.swing.*;
import java.awt.*;

class LabelThread extends Thread{
    private JLabel jl;
    private int[] x = {100, 100, 90, 110};
    private int[] y = {110, 90, 100, 100};

    public LabelThread(JLabel jl) {
        this.jl = jl;
    }

    @Override
    public void run() {
        while (true) {
            for(int i=0;i<4;i++) {
                jl.setLocation(x[i], y[i]);
                try {
                    sleep(30);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class Label extends JFrame {
    private Container ct;
    JLabel jl;
    LabelThread thread;
    public Label(){
        ct = getContentPane();
        ct.setLayout(null);
        jl = new JLabel("진동 레이블");
        jl.setOpaque(true);
        thread = new LabelThread(jl);

        jl.setLocation(100, 100);
        jl.setSize(70, 70);
        ct.add(jl);

        thread.start();

        setTitle("진동 레이블");
        setVisible(true);
        setSize(300, 300);
    }
}

public class ExercisesTwo3 {
    public static void main(String[] args) {
        new Label();
    }
}
