import java.awt.*;

public class GuiTest {
    Frame frame = new Frame("나이스");
    Button button = new Button("굳");

    public void createFrame()
    {
        frame.add(button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //프레임 열기
        GuiTest frm = new GuiTest();
        frm.createFrame();
    }
}