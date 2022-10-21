package chapter19;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

class SnowThread extends Thread {
    private Container ct;
    Snow.SnowPanel sp;
    private int x, y;

    public SnowThread(Container ct, Snow.SnowPanel sp, int x, int y){
        this.sp = sp;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        while(true){
            y+=5;

            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sp.setLocation(x, y);
        }
    }
}

class Snow extends JFrame {
    final int SNOW_SIZE = 15;
    private Container ct;

    public Snow(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ct = getContentPane();
        ct.setLayout(null);

        ImageIcon icon = new ImageIcon("background.jpg");
        JPanel jp = new JPanel(){
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };

        JLabel jl = new JLabel();
        jl.setIcon(icon);
        jl.setSize(800, 800);
//        ct.add(jl);
//        setContentPane(jl);

        jl.setLocation(0, 0);

        jl.add(new SnowPanel());
        SnowPanel sp = new SnowPanel();
        jl.setLayout(null);
        ct.add(sp);

//        setContentPane(new SnowPanel());




        setTitle("눈 내리는 샤갈의 마을");
        setVisible(true);
        setSize(800, 800);
    }


    class SnowPanel extends JPanel {
        private Vector<Point> vec;

        public void paintComponent(Graphics g) {
            super.paintComponents(g);
            g.setColor(Color.WHITE);
            int x = (int) (Math.random() * 700) + 50;
            int y = 0;
            g.fillOval(x, y, SNOW_SIZE, SNOW_SIZE);
        }
    }

}

public class ProfessorsExercises1 {
    public static void main(String[] args) {
        new Snow();
    }
}
