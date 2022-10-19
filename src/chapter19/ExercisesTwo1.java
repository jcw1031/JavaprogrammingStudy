package chapter19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ThreadCircle extends Thread {
    private Container ct;

    public ThreadCircle(Container ct){
        this.ct = ct;
    }

    @Override
    public void run() {
        while(true){

        }
    }
}

public class ExercisesTwo1 extends JFrame {
    private Container ct;
    public ExercisesTwo1(){
        ct = getContentPane();

        setVisible(true);
        setSize(300, 300);

        setContentPane(new MyPanel());
    }

    public static void main(String[] args) {
        new ExercisesTwo1();
    }

    class MyPanel extends JPanel{
        Thread th = null;
        public void paintComponent(Graphics g) {
            super.paintComponents(g);
            g.setColor(Color.MAGENTA);
            int x = (int)(Math.random()*300)+50;
            int y = (int)(Math.random()*300)+50;
            g.drawOval(x, y, 50, 50);
        }

        public void run(){

        }
    }
}
