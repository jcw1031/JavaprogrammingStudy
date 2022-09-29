package Chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GroupHolderTest extends JFrame implements ActionListener {
    private JPanel jp1, jp2, jp3, jp4;
    private JTextField tf;
    private JTextArea ta;
    private JTabbedPane tp;
    private JLabel[] jl;

    public GroupHolderTest() {
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();

        tf = new JTextField(20);
        ta = new JTextArea(10, 20);
        tp = new JTabbedPane();
        jl = new JLabel[4];

        ta.setEditable(false);

        jp1.add(tf);
        jp1.add(ta);

        tf.addActionListener(this);

        tp.addTab("1", jp1);
        tp.addTab("2", jp2);

        add(tp);

        setTitle("Java");
        setSize(500, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(tf)) {
            if (ta.getLineCount() <= ta.getRows()) {
                ta.append(e.getActionCommand() + "\n");
                tf.setText("");
            } else {
                jl[0].setText("입력 종료");
                tf.setEditable(false);
            }
        }
    }

    public static void main(String[] args) {
        new GroupHolderTest();
    }
}

