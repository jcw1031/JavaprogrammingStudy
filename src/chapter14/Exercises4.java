package chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventTest1 extends JFrame implements ActionListener {
    private Container container = getContentPane();
    private JButton[] buttons = new JButton[4];
    private JLabel label = new JLabel();

    public EventTest1(){
        container.setLayout(new FlowLayout());
        for(int i=0;i<4;i++){
            buttons[i]= new JButton((i+1)+"학년");
            container.add(buttons[i]);
            buttons[i].addActionListener(this);
        }
        container.add(label);

        setTitle("Event Test 1");
        setSize(330, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(e.getActionCommand());
    }
}

public class Exercises4 {
    public static void main(String[] args) {
        new EventTest1();
    }

}
