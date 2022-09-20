import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;

class Test extends JFrame{
    static JPanel jpMenuImage = new JPanel(){
        Image background = new ImageIcon(Main.class.getResource("/image/IMG_9510.JPG")).getImage();
        public void paint(Graphics g){
            g.drawImage(background, 5, 5, null);
        }
    };
    static JPanel[] jpMI = new JPanel[6];
    public void makeImageObject(){
        for(int i=0;i<6;i++){
            jpMI[i] = new JPanel();
            jpMI[i] = jpMenuImage;
        }
    }


    public Test() {
        makeImageObject();
        System.out.println(jpMenuImage);
        System.out.println(jpMI[3]);
        Container ctMain = getContentPane();
        ctMain.setLayout(new BorderLayout(10, 10));
        JPanel jpImage = new JPanel(); //헤더
        ctMain.add(jpImage, BorderLayout.NORTH);
        jpImage.add(new JLabel("사진"));
        JPanel jpMenu = new JPanel(); //2행 3열 메뉴판
        jpMenu.setLayout(new GridLayout(2, 3, 10, 10));
        ctMain.add(jpMenu, BorderLayout.CENTER);
        JPanel[] jpInfo = new JPanel[6]; //6개의 메뉴
        JPanel[] jpSet = new JPanel[6]; //버튼과 수량이 표시(plus/minus 버튼, amount 레이블
        JLabel[] amount = new JLabel[6];
        JButton[] plus = new JButton[6];
        JButton[] minus = new JButton[6];
        JPanel[] jpInfoImage = new JPanel[6]; //메뉴 사진

        for (int i = 0; i < 6; i++) {
            jpInfoImage[i] = new JPanel();
            jpInfo[i] = new JPanel();
            jpSet[i] = new JPanel();
            jpInfo[i].setLayout(new BorderLayout(10, 10));
            jpSet[i].setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
            jpMenu.add(jpInfo[i]);
            jpInfoImage[i].setLayout(new BorderLayout(5, 5));
            jpInfo[i].add(jpInfoImage[i], BorderLayout.CENTER);
            jpInfoImage[i].add(jpMI[i], BorderLayout.CENTER);
            minus[i] = new JButton(" - ");
            plus[i] = new JButton(" + ");
            jpSet[i].add(minus[i]);
            amount[i] = new JLabel("0");
            jpSet[i].add(amount[i]);
            jpSet[i].add(plus[i]);
            jpInfo[i].add(jpSet[i], BorderLayout.SOUTH);
        }

        ActionListener plusListener = new ActionListener() { //plus 버튼 클릭 시
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
        setSize(600, 650);
        setVisible(true);
    }
}

public class GuiTest{
    public static void main(String[] args) {
        new Test();
    }
}