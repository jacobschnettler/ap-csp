import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.util.Random;
import java.applet.*;

public class PixelWriting extends Applet
{
    Image buffer;

    Graphics bufferG;

    Color[] myColors = { Color.red, Color.white, Color.blue };

    int myPicture [][] = {
            { 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0 },
            { 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1 },
            { 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0 },
            { 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1 },
            { 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        };

    AudioClip loadingMusic;

    Image bustaImage;

    public void init()
    {
        this.resize(1300, 700);

        buffer = createImage(this.getWidth(), this.getHeight());

        bufferG = buffer.getGraphics();

        loadingMusic = this.getAudioClip(this.getCodeBase(), "./america.wav");

        loadingMusic.play();
        loadingMusic.loop();

        bustaImage = this.getImage(this.getCodeBase(), "eagle.jpg");

    }

    public void update(Graphics g)
    {
        paint(g);
    }

    public void drawPicMult(int pic[][], int x, int y, int mult)
    {
        for (int r = 0; r < pic.length; r++)
            for (int c = 0; c < pic[0].length; c++)
            {
                for (int i = 1; i <= mult; i++)
                    for (int z = 1; z <= mult; z++)
                    {
                        bufferG.setColor(myColors[pic[r][c]]);

                        bufferG.drawLine(x + i + mult * c, y + z + mult * r, x + i + mult * c, y + z + mult * r);
                    }
            }
    }

    public void paint(Graphics g)
    {
        bufferG.setColor(Color.black);

        bufferG.fillRect(0, 0, 1300, 700);

        bufferG.drawImage(bustaImage, 700, 250, 600, 300, this);
        
        drawPicMult(myPicture, 100, 150, 50);

        bufferG.setColor(Color.white);

        bufferG.setFont(new Font("Ariel", 1, 20));

        bufferG.drawString("AMERICA AMERICA AMERICA AMERICA AMERICA AMERICA AMERICA AMERICA AMERICA", 100, 100);

        g.drawImage(buffer, 0, 0, this);
    }
}
