//Mohammad Sarwari
//COSC SP 15
//Programming Assignment 2
//This is my own work, I will not post another's work

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class FileIn
{
    private int[] xcoord = new int[3];
    private int[] ycoord = new int[3];

    public void Input()
    {
       try
       {
          Scanner in = new Scanner(new File("ProgrammingAssignment2Data.txt"));
          for(int i=0; i<3; i++)
          {
                xcoord[i] = in.nextInt();
                ycoord[i] = in.nextInt();
          }                     
       }
       catch(IOException e)
       {
          System.out.println("failed to open");
       }
    }
}
