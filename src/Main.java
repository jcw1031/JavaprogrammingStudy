import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.*;

class Border extends JFrame{
    public Border(){
        Container ct = getContentPane();
        FlowLayout fl = new FlowLayout(FlowLayout.RIGHT, 10, 15);
        ct.setLayout(fl);
        JPanel[] jp = new JPanel[10];
        for(int i=0;i<jp.length;i++){
            jp[i] = new JPanel();
            ct.add(jp[i]);
        }
        jp[3].add(new JButton("test3"));
        jp[9].add(new JButton("test9"));
        /*ct.setLayout(new BorderLayout(10, 10));
        JButton b1 = new JButton("버튼 1");
        b1.setSize(800, 200);
        JButton b2 = new JButton("버튼 2");
        b1.setSize(1200, 200);
        JButton b3 = new JButton("버튼 3");
        b1.setSize(1200, 200);
        ct.add(BorderLayout.NORTH, b1);
        ct.add(BorderLayout.CENTER, b2);
        ct.add(BorderLayout.SOUTH, b3);*/

        setTitle("BorderLayout Test");
        setSize(800, 500);
        setVisible(true);
    }
}

public class Main{
    public static void main(String[] args){
        new Border();
    }
}