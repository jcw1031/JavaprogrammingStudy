import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Test extends JFrame{
    public Test() {
        Container ctMain = getContentPane();
        ctMain.setLayout(new BorderLayout(10, 10));
        JPanel jpImage = new JPanel();
        ctMain.add(jpImage, BorderLayout.WEST);
        jpImage.add(new JLabel("사진"));
        JPanel jpMenu = new JPanel();
        jpMenu.setLayout(new GridLayout(2, 3, 10, 10));
        ctMain.add(jpMenu, BorderLayout.CENTER);
        JPanel[] jpInfo = new JPanel[6];
        JPanel[] jpSet = new JPanel[6];
        JLabel[] amount = new JLabel[6];
        JButton[] plus = new JButton[6];
        JButton[] minus = new JButton[6];
        JPanel[] jpInfoImage = new JPanel[6];


        for (int i = 0; i < 6; i++) {
            jpInfoImage[i] = new JPanel();
            jpInfo[i] = new JPanel();
            jpSet[i] = new JPanel();
            jpInfo[i].setLayout(new BorderLayout(10, 10));
            jpSet[i].setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
            jpMenu.add(jpInfo[i]);
            jpInfoImage[i].setLayout(new BorderLayout(10, 10));
            jpInfo[i].add(jpInfoImage[i], BorderLayout.CENTER);
            jpInfoImage[i].add(new JLabel(" 사진 "), BorderLayout.CENTER);
            minus[i] = new JButton(" - ");
            plus[i] = new JButton(" + ");
            jpSet[i].add(minus[i]);
            amount[i] = new JLabel("0");
            jpSet[i].add(amount[i]);
            jpSet[i].add(plus[i]);
            jpInfo[i].add(jpSet[i], BorderLayout.SOUTH);
        }

        ActionListener plusListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<6;i++){
                    if(plus[i].equals(e.getSource())){
                        int num = Integer.parseInt(amount[i].getText());
                        num++;
                        amount[i].setText(String.valueOf(num));
                        break;
                    }
                }
            }
        };

        ActionListener minusListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 6; i++) {
                    if (minus[i].equals(e.getSource())) {
                        int num = Integer.parseInt(amount[i].getText());
                        if(num > 0) {
                            num--;
                        }
                        amount[i].setText(String.valueOf(num));
                        break;
                    }
                }
            }
        };

        for(int i=0;i<6;i++){
            plus[i].addActionListener(plusListener);
            minus[i].addActionListener(minusListener);
        }

        setTitle("test");
        setSize(800, 500);
        setVisible(true);
    }
}

public class GuiTest{
    public static void main(String[] args) {
        new Test();
    }
}