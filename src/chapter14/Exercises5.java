package chapter14;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

class Calculate extends JFrame{
    private Container container = getContentPane();
    private JButton[] buttons = new JButton[25];
    private String[] buttonName= {"Backspace", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%", "1", "2", "3", "-", "1/x"
        ,"0", "+/-", ".", "+", "="};
    private JLabel label = new JLabel("0");
    private JPanel center = new JPanel(new GridLayout(5, 5));
    public Calculate(){
        container.setLayout(new BorderLayout(50, 5));
        for(int i=0;i<25;i++){
            buttons[i] = new JButton(buttonName[i]);
            center.add(buttons[i]);
        }
        container.add(BorderLayout.NORTH, label);
        container.add(BorderLayout.CENTER, center);

        setTitle("Calculator");
        setSize(500, 250);
        setVisible(true);
    }
}

public class Exercises5 {
    public static void main(String[] args) {
        new Calculate();
    }
}
