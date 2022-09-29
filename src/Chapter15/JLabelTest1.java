package Chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JLabel1 extends JFrame implements ActionListener {
    private JLabel result = new JLabel();
    public ImageIcon i1, i2;

    public JLabel1(){
        i1 = new ImageIcon("image/CAMO.jpeg");
        i2 = new ImageIcon("image/CAMO.jpeg");

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");

        Container ct = getContentPane();

        ct.setLayout(new FlowLayout());
        ct.add(b1);
        ct.add(b2);
        ct.add(result);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setTitle("자바프로그래밍");
        setSize(300, 250);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "1"){
            result.setText("1111");
            result.setIcon(i1);
        }
        else{
            result.setText("2222");
            result.setIcon(i2);
        }
    }
}
public class JLabelTest1 {
    public static void main(String[] args) {
        JLabel1 j = new JLabel1();
    }
}
