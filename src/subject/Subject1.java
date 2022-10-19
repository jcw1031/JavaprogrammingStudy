package subject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MovingThread extends Thread{
    Container ct;
    JLabel jl;
    int x, y;

    public MovingThread(Container ct, JLabel jl, int x, int y) {
        this.ct = ct;
        this.jl = jl;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        while (true) {
            y-=5;
            if(y<=0){
                ct.remove(jl);
                break;
            }
            try {
                sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            jl.setLocation(x, y);
        }
    }
}

class BubbleGame extends JFrame {
    private Container ct;

    public BubbleGame(){
        ct = getContentPane();
        ct.setLayout(null);

        ct.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX()-40;
                int y = e.getY()-40;

                JLabel jl = new JLabel();
                ImageIcon ii = new ImageIcon("like.png");
                jl.setIcon(ii);
                jl.setSize(80, 80);
                ct.add(jl);
                jl.setLocation(x, y);
                MovingThread thread = new MovingThread(ct, jl, x, y);
                thread.start();
            }
        });

        setTitle("Bubble Game");
        setSize(1000, 800);
        setVisible(true);
    }
}

public class Subject1 {
    public static void main(String[] args) {
        new BubbleGame();
    }
}
