/* Snake game. Written by Mr. Luciano 11/13/15  Algorithm and code 
gotten from http://zetcode.com/tutorials/javagamestutorial/snake/ */
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class MySnake extends Applet implements Runnable, KeyListener
{
    Thread main = new Thread(this);
    Image buffer;
    Graphics bufferG;
    int bodyPartSize = 10;          // size of each body part
    int bodyParts = 20;              // number of pieces in snake body
    int x[] = new int [200];      // x positions of each snake body part
    int x2[] = new int [200];      // x positions of each snake body part
    int y[] = new int [200];      // y positions of each snake body part
    int y2[] = new int [200];      // y positions of each snake body part
    boolean left = false, right = true, up = false, down = false;
    
    boolean snakeAlive = true;

    public void init()
    {
        resize(1350,700);
        addKeyListener(this);
        buffer = createImage(getWidth(), getHeight());
        bufferG = buffer.getGraphics();
        for (int z = 0; z < bodyParts; z++)
        {
            x[z] = 50 - z * 10;
            x2[z] = 50 - z * 10;
            y[z] = 50;
            y2[z] = 50;
        }
        
        main.start();
    }

    private void move()
    {
        for (int z = bodyParts-1; z > 0; z--) 
        {
            x[z] = x[z - 1];
            y[z] = y[z - 1];
        }
        if (left) 
            x[0] -= bodyPartSize;
        if (right) 
            x[0] += bodyPartSize;
        if (up)
            y[0] -= bodyPartSize;
        if (down)
            y[0] += bodyPartSize;
    }

    public void run()
    {
        
        while(snakeAlive)
        {
            repaint();
            try
            { main.sleep(200);}
            catch(Exception e){}
            move();
            
            if (x[0] < 0) snakeAlive = false;
            if (x[0] > 1350) snakeAlive = false;
            
            if (y[0] < 0) snakeAlive = false;
            if (y[0] > 670) snakeAlive = false;
        }
    }

    public void keyPressed ( KeyEvent e )
    {
        int key = e.getKeyCode();

        if ( key == e.VK_LEFT && !right )
        {
            left = true;
            up = false;
            down = false;
        }
        if ( key == e.VK_RIGHT && !left ) 
        {
            right = true;
            up = false;
            down = false;
        }
        if ( key == e.VK_UP && !down ) 
        {
            up = true;
            right = false;
            left = false;
        }
        if ( key == e.VK_DOWN && !up ) 
        {
            down = true;
            right = false;
            left = false;
        }
    }

    public void keyReleased ( KeyEvent e ){}

    public void keyTyped ( KeyEvent e ){}

    public void update(Graphics g)
    {
        paint(g);
    }

    public void paint(Graphics g)
    {
        bufferG.setColor(Color.blue);
        bufferG.fillRect(0,0,1350,700);
        for (int z = 0; z < bodyParts; z++) 
        {
            if (z == 0)                // head of the snake
                bufferG.setColor( Color.white );
            else
                bufferG.setColor ( Color.green);
            bufferG.fillRect( x[z], y[z], bodyPartSize, bodyPartSize);
        }
        g.drawImage(buffer, 0,0,this);
        
        g.setColor(Color.white);
        
        /*
        for (int i = 0; i < 20; i++)
            g.drawString(i + "", 100, 200 + (i * 20));
        
        for (int i = 0; i < 20; i++)
            g.drawString(y[i] + "", 200, 200 + (i * 20));
        */  
            
        g.drawString("Left: " + (left ? "true" : "false"), 100, 100);
        g.drawString("Right: " + (right ? "true" : "false"), 100, 120);
        g.drawString("Up: " + (up ? "true" : "false"), 100, 140);
        g.drawString("Down: " + (down ? "true" : "false"), 100, 160);
        
        g.drawString("X: " + (x[0]), 100, 200);
        g.drawString("Y: " + (y[0]), 100, 220);
    }
}
