package chapter19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Token extends Thread {
    private JLabel jl;
    private int x = 130;
    private int y = 0;
    public Token(JLabel jl){
        this.jl = jl;
    }
    @Override
    public void run() {
        while(true){
            x+=5;
            if(x>=1000){
                x = 0;
            }
            jl.setLocation(x, y);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Ball extends Thread{
    private JLabel jl;
    int x = 390;
    int y = 650;
    public Ball(JLabel jl){
        this.jl = jl;
    }
    @Override
    public void run() {
        while(true){
            y-=5;
            if(y<=0){
                y=650;
                jl.setLocation(390, 650);
                break;
            }
            jl.setLocation(x, y);
            try {
                sleep(8);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Game extends JFrame {
    private Container ct;
    private JLabel ball;
    private JLabel gun;
    private JLabel token;
    private Ball ballThread;
    private Token tokenThread;
//    private ImageIcon ii;

    public Game(){
        ct = getContentPane();
        ball = new JLabel();
        gun = new JLabel();
        token = new JLabel("닭");
        token.setFont(new Font("Gothic", Font.BOLD, 100));
        tokenThread = new Token(token);
//        ii = new ImageIcon();

        ball.setOpaque(true);
        gun.setOpaque(true);
        token.setOpaque(true);

        ball.setBackground(Color.red);
        gun.setBackground(Color.black);

        token.setBackground(Color.green);

        ball.setSize(30, 30);
        gun.setSize(120, 120);
        token.setSize(130, 130);

        ct.setLayout(null);

        ct.add(gun);
        ct.add(ball);
        ct.add(token);

        gun.setLocation(340, 680);
        ball.setLocation(390, 650);
        token.setLocation(330, 0);

        tokenThread.start();

        ct.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                gun.setFocusable(true);
                gun.requestFocus();
                ballThread = new Ball(ball);
                ballThread.start();
            }
        });


        setTitle("사격 게임");
        setVisible(true);
        setSize(800, 800);

    }

    public boolean hit(){
        int tokenX = token.getX();
        int tokenY = token.getY();
        int ballX = ball.getX();
        int ballY = ball.getY();

        return false;
    }
}

public class ExercisesTwo4 {
    public static void main(String[] args) {
        new Game();
    }
}
