package chapter19;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomThread extends Thread {
    private Container contentPane;
    private boolean flag = false; // 스레드의 종료 명령을 표시하는 플래그. true :

    public RandomThread(Container contentPane) {
        this.contentPane = contentPane;
    }

    public void finish() { // 스레드 종료 명령을 Elag에 표시
        flag = true;
    }

    @Override
    public void run() {
        while (true) {
            int x = ((int) (Math.random() * contentPane.getWidth()));
            int y = ((int) (Math.random() * contentPane.getHeight()));
            JLabel label = new JLabel("java");
            label.setSize(80, 80);
            label.setLocation(x, y);
            contentPane.add(label);
            contentPane.repaint();
            try {
                Thread.sleep(300);
                if (flag) {
                    contentPane.removeAll();
                    label = new JLabel("finish");
                    label.setSize(80, 30);
                    label.setLocation(100, 100);
                    label.setForeground(Color.RED);
                    contentPane.add(label);
                    contentPane.repaint();
                }
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ThreadFinishFlagEx extends JFrame{
    private RandomThread th;

    public ThreadFinishFlagEx(){
        setTitle("ThreadFinishFlagEx");
        Container ct = getContentPane();
        ct.setLayout(null);

        ct.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                th.finish();
            }
        });
        setSize(300, 200);
        setVisible(true);

        th = new RandomThread(ct);
        th.start();
    }

    public static void main(String[] args) {
        new ThreadFinishFlagEx();
    }

}