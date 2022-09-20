package Chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Event extends JFrame{
    JButton[] cal;
    JLabel jbtest;
    String[] name = {"Backspace"," "," ","CE","C","7","8","9","/","sqrt","4","5","6","x",
            "%","1","2","3","-","1/x","0","+/-",".","+","="};
    JTextField tField;

    double result = 0;
    String operation;
    boolean flag = false;

    JPanel button;

    public void makePanel(){
        button = new JPanel(new GridLayout(5, 5, 5, 5));
        for(int i=0;i<25;i++){
            button.add(cal[i]);
        }
    }

    public void makeButton(){
        cal = new JButton[25];
        for(int i=0;i<25;i++){
            cal[i] = new JButton(name[i]);
            cal[i].setBackground(Color.YELLOW);
            if(i%5==3 || i%5 == 4){
                cal[i].setForeground(Color.red);
            }
            else{
                cal[i].setForeground(Color.BLUE);
            }
        }
    }

    public void makeField(){
        tField = new JTextField();
        tField.setText("0");
    }

    public Event(){
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout(5, 5));
        makeButton();
        makeField();
        makePanel();
        ct.add(tField, BorderLayout.NORTH);
        ct.add(button, BorderLayout.CENTER);

        for(int i=0;i<25;i++){
            cal[i].addActionListener(new EventProcess());
        }

        setTitle("Event Test");
        setSize(500, 300);
        setVisible(true);
    }
    private class EventProcess implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String tmp = e.getActionCommand();

            switch (tmp){
                case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" : {
                    if(flag){
                        tField.setText(tmp);
                        flag = false;
                    }
                    else if(!tField.getText().equals("0")){
                        tField.setText(tField.getText()+tmp);
                    }
                    else{
                        tField.setText(tmp);
                    }
                    break;
                }
                case "Backspace" : {
                    if(!tField.getText().equals("0")){
                        if(tField.getText().length() == 1){
                            tField.setText("0");
                        }
                        else {
                            String tt = tField.getText().substring(0, tField.getText().length() - 1);
                            tField.setText(tt);
                        }
                    }
                    break;
                }
                case "CE", "C" : {
                    tField.setText("0");
                    flag = false;
                    operation = null;
                    result = 0;
                    break;
                }
                case "+", "-", "*", "/", "%" : {
                    if(!flag){
                        flag = true;
                        operation = tmp;
                    }

                    break;
                }
                case "=" : {

                }
            }
        }
    }
}
public class CalculateTest {
    public static void main(String[] args) {
        new Event();
    }
}
