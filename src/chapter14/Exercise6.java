package chapter14;

import javax.swing.*;
import java.awt.*;

class Test6 extends JFrame{
    public Test6(){
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        JPanel paint = new JPanel();
        paint.setLayout(null);
        ct.add(paint);
        JLabel[] jb = new JLabel[20];

        for(int i=0;i<20;i++){
            int x = (int)Math.random()*200;
            int y = (int)Math.random()*200;

            jb[i] = new JLabel("O");
            jb[i].setLocation(x, y);
            jb[i].setBackground(Color.BLUE);
            jb[i].setOpaque(true);
            jb[i].setSize(10, 10);
            paint.add(jb[i]);
        }

        setTitle("Random Labels");
        setSize(300, 300);
        setVisible(true);
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        new Test6();
    }
}
