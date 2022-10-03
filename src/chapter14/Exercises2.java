package chapter14;

import javax.swing.*;
import java.awt.*;

class GridLayoutTest extends JFrame {
    private Container container = getContentPane();
    public GridLayoutTest(){
        container.setLayout(new GridLayout(4, 3, 10, 10));
        JButton[] buttons = new JButton[10];
        for(int i=0;i<10;i++){
            buttons[i] = new JButton("레이아웃"+(i+1));

            container.add(buttons[i]);
        }
        setTitle("GridLayout Test");
        setSize(500, 300);
        setVisible(true);
    }
}

public class Exercises2 {
    public static void main(String[] args) {
        new GridLayoutTest();
    }
}
