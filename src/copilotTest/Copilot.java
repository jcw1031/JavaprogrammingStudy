package copilotTest;

import subject.MovingThread;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;


public class Copilot extends JFrame {
    public Copilot() {
        super("Copilot");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(null);

        HashSet<JLabel> labels = new HashSet<JLabel>();
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                JLabel jl = new JLabel();
                ImageIcon ii = new ImageIcon("like.png");
                jl.setIcon(ii);
                jl.setSize(80, 80);
                c.add(jl);
                jl.setLocation(x, y);
                labels.add(jl);
                MovingThread thread = new MovingThread(c, jl, x, y);
                thread.start();
            }
        });

        c.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                JLabel jl = new JLabel();
                ImageIcon ii = new ImageIcon("like.png");
                jl.setIcon(ii);
                jl.setSize(80, 80);
                c.add(jl);
                jl.setLocation(x, y);
                labels.add(jl);
                MovingThread thread = new MovingThread(c, jl, x, y);
                thread.start();
            }
        });

        c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
                if (e.getKeyCode() == 27) {
                    for (JLabel jl : labels) {
                        c.remove(jl);
                    }
                    labels.clear();
                    c.repaint();
                }
            }
        });

        c.setFocusable(true);
        c.requestFocus();
    }

    public static void main(String[] args) {
        Copilot cp = new Copilot();
    }
}
