package chapter14;

import javax.swing.*;
import java.awt.*;

class RandomLabelsTest extends JFrame {
    private Container container = getContentPane();
    private JLabel[] labels = new JLabel[10];
    public RandomLabelsTest(){
        container.setLayout(null);
        for(int i=0;i<10;i++){
            labels[i] = new JLabel(String.valueOf(i+1));
            labels[i].setOpaque(true);
            labels[i].setBackground(Color.blue);

            int x = (int)(Math.random()*200)+50;
            int y = (int)(Math.random()*200)+50;

            labels[i].setLocation(x, y);
            labels[i].setSize(10, 10);

            container.add(labels[i]);
        }

        setTitle("Random Labels");
        setSize(300, 300);
        setVisible(true);
    }
}

public class Exercises6 {
    public static void main(String[] args) {
        new RandomLabelsTest();
    }
}
