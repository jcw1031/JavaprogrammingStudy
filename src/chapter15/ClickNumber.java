package chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RandomMain extends MouseAdapter {
    public void mouseClick(MouseEvent e){
        JLabel tmp = (JLabel) e.getSource();
        tmp.setVisible(false);

    }
}

class Label extends JFrame {
    private JLabel[] jl;
    private Container ct = getContentPane();

    public Label() {
        ct.setLayout(null);
        jl = new JLabel[10];
        for (int i = 0; i < 10; i++) {
            jl[i] = new JLabel(String.valueOf(i));
            jl[i].setOpaque(true);
            jl[i].setBackground(Color.blue);

            int x = (int) (Math.random() * 300)+50;
            int y = (int) (Math.random() * 300)+50;

            jl[i].setLocation(x, y);
            jl[i].setSize(10, 10);

            ct.add(jl[i]);
            jl[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    super.mousePressed(e);
                }
            });
        }

        setTitle("Ten 레이블 클릭");
        setSize(400, 400);
        setVisible(true);
    }
}

public class ClickNumber {
    public static void main(String[] args) {
        new Label();
    }
}
