package chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Example1Test extends JFrame implements ActionListener {
    Container ct = getContentPane();
    private JButton[] jb;
    private ImageIcon[] ii;
    private JLabel jl;
    public Example1Test(){
        jl = new JLabel();

        jb = new JButton[2];
        jb[0] = new JButton("사과");
        jb[1] = new JButton("배");

        ii = new ImageIcon[2];
        ii[0] = new ImageIcon("사과.jpg");
        ii[1] = new ImageIcon("배.jpg");

        ct.setLayout(new FlowLayout());
        ct.add(jb[0]);
        ct.add(jb[1]);
        ct.add(jl);

        jb[0].addActionListener(this);
        jb[1].addActionListener(this);

        setVisible(true);
        setSize(300, 250);
        setTitle("asdfasdf");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("사과")){
            jl.setText("사과");
            jl.setIcon(ii[0]);
        }
        else{
            jl.setText("배");
            jl.setIcon(ii[1]);
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        new Example1Test();
    }
}
