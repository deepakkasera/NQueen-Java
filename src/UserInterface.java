/**
 * Created by deepak on 15/5/17.
 */
import java.awt.*;
import javax.swing.*;
public class UserInterface extends JPanel {
    static JFrame javaF=new JFrame("NQueens by Logic Deepak Kasera");
    static UserInterface javaUI=new UserInterface();
    static int counter;
    public static void main(String[] args) {
        javaF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        javaF.add(javaUI);
        javaF.setSize(750,512);
        javaF.setVisible(true);
        Thread TimerThread=new Thread(new TimerDraw());
        TimerThread.start();
        count();
    }
    @Override
    public void paintComponent(Graphics g) {
        g.drawString(String.valueOf(counter), 20, 30);
    }
    public static void count() {
        while(true) {
            TimerDraw.ttt();
        }
    }
}
