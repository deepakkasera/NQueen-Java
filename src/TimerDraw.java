/**
 * Created by deepak on 15/5/17.
 */
public class TimerDraw implements Runnable{
    @Override
    public void run() {
        while(true)
        {
            UserInterface.javaF.repaint();
            try{
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}