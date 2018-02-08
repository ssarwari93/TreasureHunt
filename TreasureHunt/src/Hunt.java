//Mohammad Sarwari
//COSC SP 15
//Programming Assignment 2
//This is my own work, I will not post another's work

import java.awt.*;

public class Hunt
{
    public static int game = 500;
    public static int side = 50;

    private int tx;
    private int ty;
    private int x;
    private int y;
    private String status = null;
    private boolean over = false;

    public Hunt()
    {
        tx = 250;
        ty = 300;
    }    

    public void game(int x, int y)
    {
        if (Math.abs(x - tx)<(side/2) && Math.abs(y - ty)<(side/2))
        {
            over = true;
            status = "Found";
        }
        else if (Math.abs(x - tx)<(side) && Math.abs(y - ty)<(side))
            status = "Hot";
        else if (Math.abs(x - tx)<(side*2) && Math.abs(y - ty)<(side*2))
            status = "Warm";
        else if (Math.abs(x - tx)<(side*3) && Math.abs(y - ty)<(side*3))
            status = "Lukewarm";
        else if (Math.abs(x - tx)<(side*4) && Math.abs(y - ty)<(side*4))
            status = "Cold";
    }
    
    public boolean gameOver()
    {
        return over;
    }

    public void draw(Graphics graph, int x, int y)
    {
        if (status.equals("Found"))
        {
            graph.setColor(Color.blue);
            graph.fillRect(tx - (side/2), ty - (side/2), side, side);
            graph.setColor(Color.white);
            graph.drawString("Win!", tx - (side/4), ty);
        }
        else
        {
            graph.setColor(Color.red);
            graph.drawString(status, x, y);
        }
    }
}

//Used another programmer's work as reference for the areas I didn't understand.
//The MouseMotionListener implementation brought up a few issues and I had to
//refer to the programmer's methods.

