package chapter14;

import javax.swing.*;
import java.awt.*;

class BorderLayoutTest extends JFrame {
    private Container container = getContentPane();
    public BorderLayoutTest(){
        container.setLayout(new BorderLayout());
        JButton jb1 = new JButton("버튼 1");
        JButton jb2 = new JButton("버튼 2");
        JButton jb3 = new JButton("버튼 3");

        container.add(jb1, BorderLayout.NORTH);
        container.add(jb2, BorderLayout.CENTER);
        container.add(jb3, BorderLayout.SOUTH);

        setTitle("BorderLayout Test");
        setSize(300, 125);
        setVisible(true);
    }
}

public class Exercises1 {
    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
