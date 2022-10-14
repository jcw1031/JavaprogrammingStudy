package chapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

class Example5Test extends JFrame implements ActionListener {
    Container ct = getContentPane();
    private JTextField jf;
    private JTextArea ja;
    private JButton jb;
    private JPanel jp;
    public Example5Test(){
        jb = new JButton("파일로 저장");
        jf = new JTextField("파일의 이름을 입력하세요.", 20);
        ja = new JTextArea("파일의 내용을 입력하세요.", 10, 20);

        ct.setLayout(new FlowLayout());
        jp = new JPanel();
        ct.add(ja);
        ct.add(jp);
        jp.add(jf);
        jp.add(jb);
        jb.addActionListener(this);

        setTitle("File Maker");
        setVisible(true);
        setSize(500, 300);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String name = jf.getText();
            FileOutputStream fos = new FileOutputStream(name);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF(ja.getText());
            fos.close();
            System.out.println(name+" 파일이 생성되었습니다.");
        }
        catch(Exception ex){}
    }
}

public class Example5 {
    public static void main(String[] args) {
        new Example5Test();
    }
}
