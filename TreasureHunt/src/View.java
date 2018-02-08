//Mohammad Sarwari
//COSC SP 15
//Programming Assignment 2
//This is my own work, I will not post another's work

import javax.swing.JFrame;
public class View extends JFrame
{
    public static void setWindow(String message)
    {
        JFrame window = new JFrame(message);
        window.setSize( Hunt.game, Hunt.game );
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


}
