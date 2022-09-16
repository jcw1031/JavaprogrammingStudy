import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.EventListenerProxy;

class Event extends JFrame{
    JLabel j1;
    JButton jb1, jb2;
    public Event(){
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        jb1 = new JButton("hi");
        jb2 = new JButton("hello");
        j1 = new JLabel("Press the button");
        jb1.addActionListener(new EventProcess());
        jb2.addActionListener(new EventProcess());
        ct.add(jb1);
        ct.add(jb2);
        ct.add(j1);
        setTitle("Event Test");
        setSize(250, 150);
        setVisible(true);
    }
    private class EventProcess implements ActionListener{
        public void actionPerformed(ActionEvent e){
            j1.setText(e.getActionCommand());
        }
    }
}
public class EventTest {
    public static void main(String[] args) {
        new Event();
    }
}
