package chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class Example6Test extends JFrame implements ActionListener {
    private JButton jb;
    private JTextField jf;
    private JTextArea ja;
    private JPanel jp;
    Container ct = getContentPane();

    public Example6Test(){
        jb = new JButton("파일 읽어오기");
        jf = new JTextField(20);
        ja = new JTextArea(10, 20);
        jp = new JPanel();

        ct.setLayout(new FlowLayout());

        jp.add(jf);
        jp.add(jb);
        ct.add(jp);
        ct.add(ja);

        jb.addActionListener(this);

        setTitle("File Reader");
        setSize(500, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String name = jf.getText();
            FileInputStream fis = new FileInputStream(name);
            DataInputStream dis = new DataInputStream(fis);
            ja.setText(dis.readUTF());

        } catch (FileNotFoundException ex) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}

public class Example6 {
    public static void main(String[] args) {
        new Example6Test();
    }
}
