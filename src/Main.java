import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.*;

class Border extends JFrame{
    public Border(){
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout(10, 10));
        JButton b1 = new JButton("버튼 1");
        b1.setSize(800, 200);
        JButton b2 = new JButton("버튼 2");
        b1.setSize(1200, 200);
        JButton b3 = new JButton("버튼 3");
        b1.setSize(1200, 200);
        ct.add(BorderLayout.NORTH, b1);
        ct.add(BorderLayout.CENTER, b2);
        ct.add(BorderLayout.SOUTH, b3);

        setTitle("BorderLayout Test");
        setSize(300, 150);
        setVisible(true);
    }
}

public class Main{
    public static void main(String[] args){
        new Border();
    }
}