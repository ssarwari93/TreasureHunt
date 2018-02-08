//Mohammad Sarwari
//COSC SP 15
//Programming Assignment 2
//This is my own work, I will not post another's work

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseMotionListener;



public class Controller extends JFrame implements MouseMotionListener
{
    private int x;
    private int y;
    private Hunt hunt;

    public Controller()
    {
        super("Treasure Hunt");
        hunt = new Hunt();
        addMouseMotionListener(this);
        setSize(Hunt.game, Hunt.game);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e){}

    public void mouseMoved(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        hunt.game(x,y);
        repaint();
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        hunt.draw(g,x,y);
        if (hunt.gameOver())
            removeMouseMotionListener(this);
    }

    public static void main(String[]args)
    {
        Controller con = new Controller();
        con.setBackground(Color.blue);
        con.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}