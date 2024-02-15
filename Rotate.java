import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Rotate extends Applet implements Runnable
{
    Font titleFont = new Font("bold", 1, 36);
    Thread main = new Thread(this);
    String output = "Welcome";
    
    public void init()
    {
        this.resize(1300, 756);
        
        main.start();
    }
    
    public String shiftLeft(String word)
    {
        return word.substring(1) + word.substring(0, 1);
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.setFont(titleFont);
        g.drawString(output, 230, 300);
    }
    
    public void run()
    {
        while(true)
        {
            repaint();
            
            try {
                main.sleep(500);
            } catch(Exception e) {
            }
            
            output = shiftLeft(output);
        }
    }
}
