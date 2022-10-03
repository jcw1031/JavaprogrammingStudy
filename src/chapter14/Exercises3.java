package chapter14;

import javax.swing.*;
import java.awt.*;

class ComboBox{
    private String title;
    public ComboBox(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class PanelTest extends JFrame {
    private Container container = getContentPane();
    public PanelTest(){
        container.setLayout(new GridLayout(2, 1, 5, 10));
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();
        JPanel[] topPanel = new JPanel[3];
        JPanel[] bottomPanel = new JPanel[2];
        String[] list = new String[3];
        for(int i=0;i<3;i++){
            list[i] = ""+(i+1)+"구간 지역";
        }

        JCheckBox[] checkBox = new JCheckBox[3];
        JRadioButton[] radioButtons = new JRadioButton[3];
        JButton[] buttons = new JButton[2];
        JTextArea textArea = new JTextArea(5, 20);
        JComboBox<String> comboBox = new JComboBox<>(list);

        for(int i=0;i<3;i++){
            topPanel[i] = new JPanel();
            checkBox[i] = new JCheckBox();
            radioButtons[i] = new JRadioButton();
            if(i!=2){
                buttons[i] = new JButton();
                topPanel[i].setLayout(new GridLayout(3, 1, 30, 5));
                bottomPanel[i] = new JPanel();
            }
            else{
                topPanel[i].setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
            }
        }
        checkBox[0].setText("red");
        checkBox[1].setText("green");
        checkBox[2].setText("blue");

        radioButtons[0].setText("A형");
        radioButtons[1].setText("B형");
        radioButtons[2].setText("O형");

        buttons[0].setText("선택");
        buttons[1].setText("취소");

        textArea.setText("자료 입력 공간");

        top.setLayout(new GridLayout(1, 3));
        bottom.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 50));

        for(int i=0;i<3;i++) {
            topPanel[0].add(checkBox[i]);
            topPanel[1].add(radioButtons[i]);
            if(i!=2){
                topPanel[2].add(buttons[i]);
                bottom.add(bottomPanel[i]);
            }
            else{
                bottomPanel[0].add(textArea);
                bottomPanel[1].add(comboBox);
            }
            top.add(topPanel[i]);
        }
        container.add(top);
        container.add(bottom);

        setTitle("Panel Test");
        setSize(500, 500);
        setVisible(true);
    }
}

public class Exercises3 {
    public static void main(String[] args) {
        new PanelTest();
    }
}
