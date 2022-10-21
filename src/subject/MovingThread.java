package subject;

import javax.swing.*;
import java.awt.*;

public class MovingThread extends Thread { //레이블을 움직이게 하는 쓰레드 클래스
    Container ct;
    JLabel jl;
    int x, y;

    public MovingThread(Container ct, JLabel jl, int x, int y) {
        this.ct = ct;
        this.jl = jl;
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() { //start()를 실행하면 수행되는 run() 메소드
        while (true) {
            y -= 5;
            if (y <= 0) {
                ct.remove(jl);
                break;
            }
            try {
                sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            jl.setLocation(x, y);
        }
    }
}
