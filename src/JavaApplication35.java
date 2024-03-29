import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

class Ex9 extends JFrame{
    GamePanel p;
    Ex9(){
        this.setTitle("스네이크 움직이기");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p=new GamePanel();
        this.setLocationRelativeTo(null);
        this.setSize(400,400);
        this.setVisible(true);
        this.add(p);
        p.requestFocus();
        Thread s=new Thread(p);
        s.start();
    }

    class GamePanel extends JPanel implements Runnable{
        static final int LEFT=0;
        static final int RIGHT=1;
        static final int UP=2;
        static final int DOWN=3;
        static final int DELAY=200;//0.2초마다 움직인다.
        int direction;//방향 설정
        SnakeBody snakebody;

        GamePanel(){
            this.setLayout(null);
            snakebody=new SnakeBody();
            snakebody.addIn(this);
            direction=LEFT;//초기방향
            this.addKeyListener(new MyKeyListener());
        }

        public void paintComponent(Graphics g){//배경을 위한 메소드
            super.paintComponent(g);
            ImageIcon icon= new ImageIcon("bg.jpg");
            Image img=icon.getImage();
            g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),null);
        }

        class MyKeyListener implements KeyListener{
            @Override
            public void keyTyped(KeyEvent ke) {}

            @Override
            public void keyPressed(KeyEvent ke) {//방향설정 키 리스너
                switch(ke.getKeyCode()){//입력된 키에 따른 방향 설정
                    case KeyEvent.VK_LEFT:
                        direction=LEFT; break;
                    case KeyEvent.VK_RIGHT:
                        direction=RIGHT; break;
                    case KeyEvent.VK_UP:
                        direction=UP; break;
                    case KeyEvent.VK_DOWN:
                        direction=DOWN; break;
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {}
        }

        public void run(){
            while(true){
                try{//딜레이 만큼 기다렸다가 입력된방향으로 이동
                    Thread.sleep(DELAY);
                    snakebody.move(direction);
                }
                catch(Exception e){
                    return;
                }
            }
        }
    }


    class SnakeBody{
        Vector<JLabel> v = new Vector<JLabel>();//스네이크의 형태의 위치들을 기억하기 위함

        public SnakeBody(){
            //머리부분 생성
            ImageIcon head = new ImageIcon("head.jpg");
            JLabel la =new JLabel("머리");
            la.setSize(head.getIconWidth(),head.getIconHeight());//이미지크기만큼 크기를 설정
            la.setLocation(100, 100);
            v.add(la);

            //몸체부분 생성
            ImageIcon body=new ImageIcon("body.jpg");
            for(int i=1; i<10; i++){//몸체 10개 생성
                la=new JLabel("몸통");
                la.setSize(body.getIconWidth(),body.getIconHeight());
                la.setLocation(100+i*20, 100);
                v.add(la);
            }
        }

        public void addIn(JPanel panel){//몸체를 패널에 추가
            for(int i=0; i<v.size(); i++)
                panel.add(v.get(i));
        }

        public void move(int direction){//각 몸체부분을 전에 있던 몸체 위치로 옮긴다.
            for(int i=v.size()-1;i>0;i--){
                JLabel b=v.get(i);
                JLabel a=v.get(i-1);
                b.setLocation(a.getX(), a.getY());
            }

            JLabel head=v.get(0);
            switch(direction){//입력된 방향만큼 20픽셀씩 이동한다.
                case GamePanel.LEFT:
                    head.setLocation(head.getX()-20, head.getY());
                    break;
                case GamePanel.RIGHT:
                    head.setLocation(head.getX()+20, head.getY());
                    break;
                case GamePanel.UP:
                    head.setLocation(head.getX(), head.getY()-20);
                    break;
                case GamePanel.DOWN:
                    head.setLocation(head.getX(), head.getY()+20);
                    break;
            }
        }
    }
}
public class JavaApplication35 {
    public static void main(String[] args) {
        new Ex9();
    }
}