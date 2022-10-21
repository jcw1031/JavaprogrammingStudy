package chapter19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class WordThread extends Thread {
    private JLabel jl;
    int x, y;

    public WordThread(JLabel jl, int x, int y) {
        this.jl = jl;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        while(true){
            y+=5;
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            jl.setLocation(x, y);
        }
    }
}

class WordGame extends JFrame {
    private Container ct;
    private JLabel jl;
    FileReader fr = new FileReader("words.txt");
    List<String> list = new ArrayList<>();
    int x, y;
    private JTextField jf;
    private JButton jb;

    public WordGame() throws FileNotFoundException, InterruptedException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ct = getContentPane();
        ct.setLayout(null);
        jl = new JLabel("sfasdf");
        ct.add(jl);
        jl.setLocation(5, 5);
        jl.setSize(50, 20);

        jf = new JTextField(20);
        ct.add(jf);
        jf.setLocation(300, 650);
        jf.setSize(200, 30);

        jb = new JButton("Enter");
        ct.add(jb);
        jb.setLocation(200, 650);
        jb.setSize(70, 30);


        String s = "";
        while(true){
            try {
                int tmp = (fr.read());
                if((char)tmp == '\n'){
                    list.add(s);
                    s = "";
                    continue;
                }
                if(tmp == -1){
                    break;
                }
                s+=(char)tmp;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        int size = list.size();

        System.out.println("통과");


        setTitle("Word Game");
        setVisible(true);
        setSize(800, 800);

        while(true){
            int index = (int)(Math.random()*size);
            String word = list.get(index);
            JLabel rain = new JLabel();

            System.out.println(word);
            rain.setText(word);

            x = 300;
            y = 50;
            ct.add(rain);
            rain.setLocation(x, y);
            rain.setSize(200, 50);


            WordThread thread = new WordThread(rain, x, y);
            thread.start();

            jb.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    String tmp = jf.getText();
                    if(word.equals(tmp)){
                        jf.setText("");
                    }
                }
            });
            thread.join();
        }

    }

}

public class ProfessorsExercises2 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        new WordGame();
    }
}
